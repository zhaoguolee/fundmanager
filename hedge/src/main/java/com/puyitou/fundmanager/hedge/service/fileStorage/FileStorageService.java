package com.puyitou.fundmanager.hedge.service.fileStorage;

import org.springframework.web.multipart.MultipartFile;

import com.puyitou.fundmanager.hedge.model.FileStorage;

public interface FileStorageService {

	FileStorage saveFile(MultipartFile file, String metadata);

	FileStorage findById(String id);

}
