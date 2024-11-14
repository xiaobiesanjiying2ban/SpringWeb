package com.example.springweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//请求处理类
@RestController
public class HelloController {
//	处理的请求路径
	@RequestMapping("/hello")
	public String hello() {
//		打印到idea终端
		System.out.println ("Hello World" );
//		打印到浏览器
		return "Hello World";
	}
}
