package com.xuhh.aop.dynamic;

/**
 * @Author: xuhh
 * @Description:
 * @Date: Created in 20:32 2018/11/4
 * @Modified By:
 */
public class RealSubjectImpl implements RealSubject{
	@Override
	public void request() {
		System.out.println("request");
	}
}
