package com.pf.demo1.test;

import com.pf.demo1.context.Context;
import com.pf.demo1.myinterface.impl.OperationAdd;
import com.pf.demo1.myinterface.impl.OperationMultiply;
import com.pf.demo1.myinterface.impl.OperationSubstract;

/**
 * 测试类
 * @author PF
 *
 */
public class Test {

	public static void main(String[] args) {
		//相加
		Context context = new Context(new OperationAdd());
		int value = context.executeStrategy(4, 2);
		System.out.println("4+2="+value);
		
		//相减
		context = new Context(new OperationSubstract());
		int value2 = context.executeStrategy(4, 2);
		System.out.println("4-2="+value2);
		
		//相乘
		context= new Context(new OperationMultiply());
		int value3 = context.executeStrategy(4, 2);
		System.out.println("4*2="+value3);
	}
}
