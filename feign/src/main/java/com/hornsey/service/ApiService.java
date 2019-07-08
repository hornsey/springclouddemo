package com.hornsey.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author huangtao
 * @create 2019/7/8 21:42
 */
@FeignClient(value = "eurekaclient")
public interface ApiService {

	@GetMapping(value = "/hello/world")
	String hello();
}
