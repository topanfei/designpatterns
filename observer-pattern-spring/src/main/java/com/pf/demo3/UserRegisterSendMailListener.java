package com.pf.demo3;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.stereotype.Component;

import com.pf.basic.UserBean;
import com.pf.basic.UserRegisterEvent;
import com.pf.basic.UserService;

@Component
public class UserRegisterSendMailListener implements SmartApplicationListener{

	/**
	 * supportsEventType & supportsSourceType 两个方法返回true时调用该方法执行业务逻辑
	 * @param event 具体监听实例，这里是UserRegisterEvent
	 */
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		//转换事件类型
		UserRegisterEvent userRegisterEvent= (UserRegisterEvent) event;
		//获取注册用户对象信息
		UserBean userBean = userRegisterEvent.getUserBean();
		
		//给注册用户发送邮件通知
		System.out.println("demo3中：SmartApplicationListener方式。用户："+userBean.getName()+"，注册成功，发送邮件通知。");
		
	}

	/**
	 * 同步情况下监听执行的顺序
	 */
	@Override
	public int getOrder() {
		return 1;
	}

	/**
	 * 该方法返回true&supportsSourceType同样返回true时，才会调用该监听内的onApplicationEvent方法
	 * @param 接收到的监听事件类型
	 */
	@Override
	public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
		//只有UserRegisterEvent监听类型才会执行下面逻辑
		return eventType == UserRegisterEvent.class;
	}

	/**
	 * 该方法返回true&supportsEventType同样返回true时，才会调用该监听内的onApplicationEvent方法
	 */
	@Override
	public boolean supportsSourceType(Class<?> sourceType) {
		//只有在UserService内发布的UserRegisterEvent事件时才会执行下面逻辑
		return sourceType == UserService.class;
	}

}
