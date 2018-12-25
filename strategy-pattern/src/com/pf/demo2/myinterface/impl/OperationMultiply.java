package com.pf.demo2.myinterface.impl;

import com.pf.demo2.myinterface.Strategy;

/**
 * 策略2：两数相乘
 * @author PF
 *
 */
public class OperationMultiply implements Strategy{

	@Override
	public boolean check(String param) {
		if("mul".equals(param)) {
			return true;
		}
		return false;
	}

	@Override
	public int doOperation(int num1, int num2) {
		return num1 * num2;
	}

}
