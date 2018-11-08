package com.xuhh.aop.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: xuhh
 * @Description:
 * @Date: Created in 22:13 2018/11/8
 * @Modified By:
 */
public class DemoMethodInterceptor implements MethodInterceptor {

	@Override
	public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.println("before  in cglib");
		Object result =null;
		try {
			result = methodProxy.invokeSuper(o,args);
		}catch (Exception e){
			System.out.println("get ex : "+e.getMessage());
			throw e;
		}finally {
			System.out.println("after in cglib");
		}
		return result;
	}
}
