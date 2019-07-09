package com.hornsey.feign.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author huangtao
 * @create 2019/7/6 14:22
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

	@Value("${server.port}")
	private String port;

	@GetMapping("/world")
	public String worldHandler() {
		return "hello world, this is eureka client!\n Port: " + port;
	}
}
