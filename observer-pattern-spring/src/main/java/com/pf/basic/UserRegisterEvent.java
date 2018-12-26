package com.pf.basic;

import org.springframework.context.ApplicationEvent;

/**
 * 创建一个事件，监听都是围绕着事件来挂机的
 * @author PF
 *
 */
public class UserRegisterEvent extends ApplicationEvent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserBean userBean;//注册用户对象
	
	public UserBean getUserBean() {
		return userBean;
	}
	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}

	/*
	 * 重写构造方法（构造函数的参数可以任意指定，其中source参数指定的是发生事件的对象）
	 * @param source 发生事件的对象
	 * @param userBean 注册用户对象
	 */
	public UserRegisterEvent(Object source,UserBean userBean) {
		super(source);
		this.userBean = userBean;
	}

}
