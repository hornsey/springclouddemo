package com.hornsey.feign.controller;

import com.hornsey.feign.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author huangtao
 * @create 2019/7/9 20:38
 */
@RestController
public class ApiController {

	@Autowired
	private ApiService apiService;

	@RequestMapping("index")
	public String index() {
		return apiService.hello();
	}


}
