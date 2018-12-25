package com.pf.demo1.myinterface.impl;

import com.pf.demo1.myinterface.Strategy;

/**
 * 策略1：实现两数相加
 * @author PF
 *
 */
public class OperationAdd implements Strategy {

	/*
	 * 重写行为方法
	 */
	@Override
	public int doOperation(int num1, int num2) {
		return num1+num2;
	}

}
