package com.pf.demo2;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.pf.basic.UserBean;
import com.pf.basic.UserRegisterEvent;

/**
 * 我们实现接口后需要使用@Component注解来声明该监听需要被spring注入管理
 * 当有UserRegisterEvent事件发布时监听程序会自动调用onApplicationEvent方法并且将UserRegisterEvent对象作为参数传递
 * @author PF
 *
 */
@Component
public class RegisterListener implements ApplicationListener<UserRegisterEvent>{

	/**
	 * 实现监听
	 */
	@Override
	public void onApplicationEvent(UserRegisterEvent userRegisterEvent) {
		//获取注册用户对象
		UserBean userBean = userRegisterEvent.getUserBean();
		
		//省略逻辑的处理操作
		
		//输出注册用户信息
		System.out.println("demo2中：ApplicationListener方式的注册信息，用户名："+userBean.getName()+"，密码："+userBean.getPassword());
	}

}
