package com.xuhh.aop.service;

import com.xuhh.aop.security.CurrentUserHolder;
import org.springframework.stereotype.Service;

/**
 * @Author: xuhh
 * @Description:
 * @Date: Created in 0:01 2018/10/29
 * @Modified By:
 */
@Service
public class AuthService {

	public void checkAccess(){
		String user = CurrentUserHolder.get();
		if(!"admin".equals(user)){
			throw new RuntimeException("operation is not allowed!");
		}
	}
}
