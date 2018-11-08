package com.xuhh.aop.cglib;


import com.xuhh.aop.dynamic.RealSubject;
import com.xuhh.aop.dynamic.RealSubjectImpl;
import org.springframework.cglib.proxy.Enhancer;

/**
 * @Author: xuhh
 * @Description:
 * @Date: Created in 22:21 2018/11/8
 * @Modified By:
 */
public class App {

	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(RealSubjectImpl.class);
		enhancer.setCallback(new DemoMethodInterceptor());
		RealSubject realSubject  =(RealSubject)enhancer.create();
		realSubject.request();

	}
}
