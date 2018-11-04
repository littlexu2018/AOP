package com.xuhh.aop.dynamic;

import java.lang.reflect.Proxy;

/**
 * @Author: xuhh
 * @Description:
 * @Date: Created in 20:49 2018/11/4
 * @Modified By:
 */
public class App {

	public static void main(String[] args) {
		RealSubject realSubject = (RealSubject)Proxy.newProxyInstance(App.class.getClassLoader()
				,new Class[]{RealSubject.class},new JdkProxySubject(new RealSubjectImpl()));
		realSubject.request();
	}
}
