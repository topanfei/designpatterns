package com.pf.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * 实现注册事件功能
 * @author PF
 *
 */
@Service
public class UserService {

	@Autowired
	private ApplicationContext applicationContext;
	
	/**
	 * 用户注册方法
	 * @param userBean
	 */
	public void register(UserBean userBean) {
		//发布UserRegisterEvent事件
		applicationContext.publishEvent(new UserRegisterEvent(this, userBean));
	}
}
