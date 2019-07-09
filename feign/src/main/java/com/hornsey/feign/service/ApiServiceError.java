package com.hornsey.feign.service;

import org.springframework.stereotype.Component;

/**
 * @Author huangtao
 * @create 2019/7/9 20:36
 */
@Component
public class ApiServiceError implements ApiService{

	@Override
	public String hello() {
		return "服务发送故障！";
	}
}
