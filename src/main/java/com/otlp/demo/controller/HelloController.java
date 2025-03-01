package com.otlp.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.otlp.demo.service.HelloService;

@RestController
@RequestMapping("/api/v1")
public class HelloController {

	@Autowired
	private HelloService helloService;
	
	@GetMapping("/hello")
	public String helloMessage()
	{
		return helloService.helloMessage();
	}
}
