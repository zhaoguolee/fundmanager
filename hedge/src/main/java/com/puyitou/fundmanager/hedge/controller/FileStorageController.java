package com.puyitou.fundmanager.hedge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.puyitou.fundmanager.hedge.model.FileStorage;
import com.puyitou.fundmanager.hedge.service.fileStorage.FileStorageService;
import com.puyitou.fundmanager.hedge.system.exception.ApplicationException;
import com.puyitou.fundmanager.hedge.system.response.RestResponseBody;

@RestController
@RequestMapping(path = "/fileStorage")
public class FileStorageController {

	@Autowired
	private FileStorageService fileStorageService;

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public RestResponseBody<?> upload(@RequestParam(value = "file", required = false) MultipartFile file,
			@RequestParam(value = "description", required = false) String description) {
		if (null == file || file.isEmpty()) {
			throw new ApplicationException("file cannot be empty");
		}
		FileStorage fileStorage = fileStorageService.saveFile(file, description);
		return new RestResponseBody<>(RestResponseBody.SUCCESS, fileStorage);
	}

	@RequestMapping(value = "/download/{id}", method = RequestMethod.GET)
	public ResponseEntity<Resource> download(@PathVariable String id) {
		FileStorage fileStorage = fileStorageService.findById(id);
		if (null == fileStorage) {
			throw new ApplicationException("file not found");
		}
		Resource file = new FileSystemResource(fileStorage.getPath());
		return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,
                "attachment; filename=\"" + file.getFilename() + "\"").body(file);
	}
	
}
