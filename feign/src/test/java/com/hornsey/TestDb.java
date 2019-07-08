package com.hornsey;

import com.hornsey.service.ApiService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author huangtao
 * @create 2019/7/8 21:45
 */
@SpringBootTest(classes = FeignApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestDb {

	@Autowired
	private ApiService apiService;

	@Test
	public void test() {
		try {
			System.out.println(apiService.hello());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
