package com.pf.demo2.myinterface.impl;

import com.pf.demo2.myinterface.Strategy;

/**
 * 策略3：两数相减
 * @author PF
 *
 */
public class OperationSubstract implements Strategy{

	@Override
	public boolean check(String param) {
		if("sub".equals(param)) {
			return true;
		}
		return false;
	}

	@Override
	public int doOperation(int num1, int num2) {
		return num1 - num2;
	}

}
