package com.pf.demo2;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.pf.basic.UserRegisterEvent;

@Component
public class RegisterUserEmailListener {

	@EventListener
	public void sendMail(UserRegisterEvent userRegisterEvent) {
		System.out.println("demo2中：用户注册成功，发送邮件通知!");
	}
}
