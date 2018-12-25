package com.pf.demo2.test;

import com.pf.demo2.context.Context;

/**
 * 测试类
 * @author PF
 *
 */
public class Test {

	public static void main(String[] args) {
		//相加
		Context context = new Context();
		int value1 = context.executeStrategy("add", 4, 2);
		System.out.println("4+2="+value1);
		
		//相减
		int value2 = context.executeStrategy("sub", 4, 2);
		System.out.println("4-2="+value2);
		
		//相乘
		int value3 = context.executeStrategy("mul", 4, 2);
		System.out.println("4*2="+value3);
	}
}
