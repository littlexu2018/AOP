package com.xuhh.aop.service;

import com.xuhh.aop.domain.Product;
import com.xuhh.aop.security.AdminOnly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: xuhh
 * @Description:
 * @Date: Created in 23:32 2018/10/28
 * @Modified By:
 */
@Service
public class ProductService {

	@Autowired
	AuthService authService;

	@AdminOnly
	public void insert(Product product){
		//authService.checkAccess();
		System.out.println("Insert product!");
	}

	@AdminOnly
	public void delete(Long id){
		//authService.checkAccess();
		System.out.println("delete product");
	}
}
