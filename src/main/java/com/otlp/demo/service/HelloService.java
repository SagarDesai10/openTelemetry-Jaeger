package com.otlp.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class HelloService {

	private final Logger logger=LoggerFactory.getLogger(HelloService.class);
	
	public String helloMessage() {
		// TODO Auto-generated method stub
		
		logger.debug("Inside hello service");
		logger.info("Inside hello method of hello service");
		return "Hello , How are you  buddy ?";
	}

}
