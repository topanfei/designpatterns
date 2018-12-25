package com.pf.demo.service.impl;


import org.springframework.stereotype.Service;

import com.pf.demo.service.AccountNumber;

@Service
public class NormalAccountNumber implements AccountNumber{

	public NormalAccountNumber() {
		System.out.println("---------NormalAccountNumber的构造函数（）-------------");
	}
	
	@Override
	public String type() {
		return "normal";
	}

	@Override
	public void sale(String name) {
		System.out.println("欢迎您！普通成员："+name);
	}

}
