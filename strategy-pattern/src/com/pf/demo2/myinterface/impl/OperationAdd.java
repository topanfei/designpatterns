package com.pf.demo2.myinterface.impl;

import com.pf.demo2.myinterface.Strategy;

/**
 * 策略1：两数相加
 * @author PF
 *
 */
public class OperationAdd implements Strategy{

	@Override
	public boolean check(String param) {
		if("add".equals(param)) {
			return true;
		}
		return false;
	}

	@Override
	public int doOperation(int num1,int num2) {
		return num1 + num2;
	}

}
