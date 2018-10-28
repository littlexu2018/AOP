package com.xuhh.aop.security;

/**
 * @Date: Created in 23:36 2018/10/28
 * 主要是用来模拟用户的切换
 */
public class CurrentUserHolder {

	private static final ThreadLocal<String> holder = new ThreadLocal<>();

	public static String get(){
		return holder.get() ==null?"unkonwn":holder.get();
	}

	public static void set(String user){
		holder.set(user);
	}
}
