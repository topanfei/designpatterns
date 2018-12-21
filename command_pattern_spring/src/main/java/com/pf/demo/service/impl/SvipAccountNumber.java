package com.pf.demo.service.impl;

import org.springframework.stereotype.Service;

import com.pf.demo.service.AccountNumber;

@Service
public class SvipAccountNumber implements AccountNumber{

	@Override
	public String type() {
		return "svip";
	}

	@Override
	public void sale(String name) {
		System.out.println("欢迎您！svip："+name);
	}

}
