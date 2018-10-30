package com.xuhh.aop.security;

import com.xuhh.aop.service.AuthService;
import com.xuhh.aop.service.ProductService;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: xuhh
 * @Description:
 * @Date: Created in 0:40 2018/10/29
 * @Modified By:
 */
@Aspect
@Component
public class SecurityAspect {

	@Autowired
	AuthService authService;

	@Pointcut("@annotation(AdminOnly)")
	public void adminOnly2(){

	}

	@Before("adminOnly2()")
	public void check(){
		authService.checkAccess();
	}
}
