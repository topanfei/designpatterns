package com.pf.demo4;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.stereotype.Component;

import com.pf.basic.UserBean;
import com.pf.basic.UserRegisterEvent;
import com.pf.basic.UserService;

@Component
public class UserRegisterListener2 implements SmartApplicationListener{

	/**
	 * supportsEventType & supportsSourceType 两个方法返回true时调用该方法执行业务逻辑
	 * @param event 具体监听实例，这里是UserRegisterEvent
	 */
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		//转换事件类型
		UserRegisterEvent userRegisterEvent = (UserRegisterEvent) event;
		//获取注册用户对象信息
		UserBean userBean = userRegisterEvent.getUserBean();
		//省略逻辑处理操作
		//输出注册用户信息
		System.out.println("demo4中：SmartApplicationListener方式注册信息，用户："+userBean.getName()+"，密码："+userBean.getPassword());
	}

	@Override
	public int getOrder() {
		return 0;
	}

	/**
	 * 该方法返回true&supportsEventType同样返回true时，才会调用该监听内的onApplicationEvent方法
	 */
	@Override
	public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
		//只有UserRegisterEvent监听类型才会执行下面逻辑
		return eventType == UserRegisterEvent.class;
	}

	/**
	 * 当方法返回true&supportsSourceType同样返回true时，才会调用该监听内的onApplicationEvent方法
	 */
	@Override
	public boolean supportsSourceType(Class<?> sourceType) {
		return sourceType == UserService.class;
	}

}

