package com.pf.test;

import com.pf.observer.impl.ObserverOne;
import com.pf.observer.impl.ObserverThree;
import com.pf.observer.impl.ObserverTwo;
import com.pf.subject.Subject;

/**
 * 测试类
 * @author PF
 *
 */
public class Test {
	public static void main(String[] args) {
		Subject subject = new Subject();
		//初始化观察者对象
		new ObserverOne(subject);
		new ObserverTwo(subject);
		new ObserverThree(subject);
		
		subject.setState(5);
	}
}
