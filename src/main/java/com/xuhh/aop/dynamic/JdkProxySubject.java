package com.xuhh.aop.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: xuhh
 * @Description:jdk动态代理实现
 * @Date: Created in 20:31 2018/11/4
 * @Modified By:
 */
public class JdkProxySubject implements InvocationHandler {

	private RealSubject realSubject;

	public JdkProxySubject(RealSubject realSubject) {
		this.realSubject = realSubject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		System.out.println("before");
		try {
			proxy =method.invoke(realSubject, args);
		}catch (Exception e){
			e.getMessage();
		}finally {
			System.out.println("after");
		}
		return proxy;
	}
}
