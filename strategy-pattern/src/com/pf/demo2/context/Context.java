package com.pf.demo2.context;

import java.util.ArrayList;
import java.util.List;

import com.pf.demo2.myinterface.Strategy;
import com.pf.demo2.myinterface.impl.OperationAdd;
import com.pf.demo2.myinterface.impl.OperationMultiply;
import com.pf.demo2.myinterface.impl.OperationSubstract;
/**
 * 策略模式的核心类
 * @author PF
 *
 */
public class Context {

	private List<Strategy> strategyList = new ArrayList<Strategy>();
	public Context() {
		strategyList.add(new OperationAdd());
		strategyList.add(new OperationSubstract());
		strategyList.add(new OperationMultiply());
	}
	
	public int executeStrategy(String param, int num1, int num2) {
		int result = 0;
		for (Strategy strategy : strategyList) {
			if(strategy.check(param)) {
				result = strategy.doOperation(num1, num2);
			}else {
				return 0;
			}
		}
		return result;
	}
}
