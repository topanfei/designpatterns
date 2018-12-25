package com.pf.demo.service.impl;

import org.springframework.stereotype.Service;

import com.pf.demo.service.AccountNumber;

@Service
public class VipAccountNumber implements AccountNumber{

	public VipAccountNumber() {
		System.out.println("---------VipAccountNumber的构造函数----------------");
	}
	
	@Override
	public String type() {
		return "vip";
	}

	@Override
	public void sale(String name) {
		System.out.println("欢迎您！vip："+name);
	}

}
