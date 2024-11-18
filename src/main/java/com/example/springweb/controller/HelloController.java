package com.example.springweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//请求处理类
@RestController
public class HelloController {
	/**
	 * 处理访问 "/hello" 路径的请求。
	 *
	 * @return 返回 "Hello World" 字符串，该字符串会被发送到客户端浏览器显示。
	 */
//	处理的请求路径
	@RequestMapping("/hello")
	public String hello() {
//		打印到idea终端
		System.out.println ("Hello World" );
//		打印到浏览器
		return "Hello World";
	}
}
