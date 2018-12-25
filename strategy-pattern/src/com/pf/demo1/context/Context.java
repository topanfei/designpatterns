package com.pf.demo1.context;

import com.pf.demo1.myinterface.Strategy;

/**
 * 动态切换策略的类
 * @author PF
 */
public class Context {

	private Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public int executeStrategy(int num1, int num2) {
		return strategy.doOperation(num1, num2);
	}
}
