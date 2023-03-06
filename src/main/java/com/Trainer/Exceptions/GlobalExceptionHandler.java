package com.Trainer.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



@Component
@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(GroupNotFound.class)
	public ResponseEntity<String> groupNotFound(){
		return new ResponseEntity<String>("No groups found",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(GroupAlreadyExists.class)
	public ResponseEntity<String> groupAlreadyExists(){
		return new ResponseEntity<String>("This group already exists",HttpStatus.CONFLICT);
	}


}
