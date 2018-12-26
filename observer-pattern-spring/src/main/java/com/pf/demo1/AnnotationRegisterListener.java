package com.pf.demo1;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.pf.basic.UserBean;
import com.pf.basic.UserRegisterEvent;

@Component
public class AnnotationRegisterListener {

	/**
	 * 我们只需要让我们的监听类被Spring所管理即可，在我们用户注册监听实现方法上添加@EventListener注解。
	 * 该注解会根据方法内配置的事件完成监听
	 * @param userRegisterEvent
	 */
	@EventListener
	public void register(UserRegisterEvent userRegisterEvent) {
		//获取注册用户对象
		UserBean user = userRegisterEvent.getUserBean();
		//省略逻辑的处理
		
		//输出注册用户信息
		System.out.println("demo1中：@EventListener方式注册信息，用户名："+user.getName()+",密码："+user.getPassword());
	}
}
