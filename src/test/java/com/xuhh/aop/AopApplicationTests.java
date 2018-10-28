package com.xuhh.aop;

import com.xuhh.aop.security.CurrentUserHolder;
import com.xuhh.aop.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AopApplicationTests {
	@Autowired
	ProductService productService;

	@Test(expected = Exception.class)
	public void annoInsertTest() {
		CurrentUserHolder.set("xuhh");
		productService.delete(1L);
	}

	@Test()
	public void annoInsertTest2() {
		CurrentUserHolder.set("admin");
		productService.delete(1L);
	}

}
