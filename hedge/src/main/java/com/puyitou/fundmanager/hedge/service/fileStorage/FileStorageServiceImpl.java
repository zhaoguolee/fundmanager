package com.puyitou.fundmanager.hedge.service.fileStorage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.puyitou.fundmanager.hedge.mapper.FileStorageMapper;
import com.puyitou.fundmanager.hedge.model.FileStorage;
import com.puyitou.fundmanager.hedge.model.User;
import com.puyitou.fundmanager.hedge.system.exception.ApplicationException;
import com.puyitou.fundmanager.hedge.system.security.SecurityUserService;
import com.puyitou.fundmanager.hedge.system.util.FilenameUtils;

@Service
public class FileStorageServiceImpl implements FileStorageService {

	private final Logger log = LoggerFactory.getLogger(getClass());

	@Value("${server.upload.basedir}")
	private String basedir;

	@Value("${server.upload.baseuri}")
	private String baseuri;
	
	@Autowired
	private FileStorageMapper fileStorageMapper;
	
	@Autowired
	private SecurityUserService securityUserService;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public FileStorage saveFile(MultipartFile file, String description) {
		LocalDate localDate = LocalDate.now();
		String fileName = UUID.randomUUID().toString() + "." + FilenameUtils.getExtension(file.getOriginalFilename());
		File filePath = Paths.get(basedir, String.valueOf(localDate.getYear()),
				String.valueOf(localDate.getMonthValue()), String.valueOf(localDate.getDayOfMonth())).toFile();
		if (!filePath.exists()) {
			filePath.mkdirs();
		}
		File saveFile = new File(filePath, fileName);
		Path basePath = Paths.get(basedir);
		Path relativePath = basePath.relativize(saveFile.toPath());
		String uri = Paths.get(baseuri, relativePath.toString()).toString();
		try {
			file.transferTo(saveFile);
		} catch (IllegalStateException | IOException e) {
			log.error("file upload failed", e);
			throw new ApplicationException("file upload failed", e);
		}
		long now = System.currentTimeMillis();
		FileStorage fileStorage = new FileStorage();
		fileStorage.setId(UUID.randomUUID().toString());
		fileStorage.setContentType(file.getContentType());
		fileStorage.setFileName(file.getOriginalFilename());
		fileStorage.setLength(file.getSize());
		fileStorage.setDescription(description);
		fileStorage.setUri(uri.toString());
		fileStorage.setPath(saveFile.getAbsolutePath());
		fileStorage.setCreateTime(now);
		User user = securityUserService.currentUser();
		fileStorage.setLoginName(user.getLoginName());
		fileStorageMapper.insertSelective(fileStorage);
		return fileStorage;
	}

	@Override
	public FileStorage findById(String id) {
		return fileStorageMapper.selectByPrimaryKey(id);
	}

}
