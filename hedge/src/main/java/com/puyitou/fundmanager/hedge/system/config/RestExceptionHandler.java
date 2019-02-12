package com.puyitou.fundmanager.hedge.system.config;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.puyitou.fundmanager.hedge.system.exception.ApplicationException;
import com.puyitou.fundmanager.hedge.system.response.RestResponseBody;

@RestControllerAdvice
public class RestExceptionHandler {

	private final Logger log = LoggerFactory.getLogger(getClass());

	@ExceptionHandler({ BindException.class })
	public ResponseEntity<Object> handleBindExceptionException(BindException ex) {
		List<ObjectError> errors = ex.getAllErrors();
		StringBuilder sb = new StringBuilder();
		errors.stream().forEach(
				error -> sb.append(error.getDefaultMessage()).append("; "));
		RestResponseBody<String> body = new RestResponseBody<>(RestResponseBody.ERROR);
		body.setMessage(sb.toString());
		return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler({ AccessDeniedException.class })
	public ResponseEntity<Object> handleAccessDeniedException(AccessDeniedException ex) {
		log.info("handleApplicationException", ex);
		RestResponseBody<String> body = new RestResponseBody<>(RestResponseBody.ERROR);
		body.setMessage(Optional.ofNullable(ex.getMessage()).orElse("internal error"));
		return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
	}
	
	@ExceptionHandler({ ApplicationException.class })
	public ResponseEntity<Object> handleApplicationException(ApplicationException ex) {
		log.info("handleApplicationException", ex);
		RestResponseBody<String> body = new RestResponseBody<>(RestResponseBody.ERROR);
		body.setMessage(Optional.ofNullable(ex.getMessage()).orElse("internal error"));
		return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler({ DuplicateKeyException.class })
	public ResponseEntity<Object> handleConstraintViolationException(DuplicateKeyException ex) {
		log.info("handleConstraintViolationException", ex);
		RestResponseBody<String> body = new RestResponseBody<>(RestResponseBody.ERROR);
		body.setMessage("该条记录已经存在");
		return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler({ Exception.class })
	public ResponseEntity<Object> handleDefaultException(Exception ex) {
		log.error("handleDefaultException", ex);
		RestResponseBody<String> body = new RestResponseBody<>(RestResponseBody.ERROR);
		body.setMessage(Optional.ofNullable(ex.getMessage()).orElse("internal error"));
		return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
	}

}
