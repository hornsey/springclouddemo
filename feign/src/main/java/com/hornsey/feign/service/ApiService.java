package com.hornsey.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author huangtao
 * @create 2019/7/8 21:42
 */
@FeignClient(value = "eurekaclient", fallback = ApiServiceError.class)
public interface ApiService {

	@GetMapping(value = "/hello/world")
	String hello();
}
