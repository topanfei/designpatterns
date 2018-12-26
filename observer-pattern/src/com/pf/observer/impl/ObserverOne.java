package com.pf.observer.impl;

import com.pf.observer.Observer;
import com.pf.subject.Subject;

/**
 * 观察者1：在初始化对象的时候，自己加到主题类中
 * @author PF
 *
 */
public class ObserverOne extends Observer{

	public ObserverOne(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("观察者1...状态值="+this.subject.getState());
	}
}
