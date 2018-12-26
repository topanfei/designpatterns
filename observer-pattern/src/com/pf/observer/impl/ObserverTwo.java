package com.pf.observer.impl;

import com.pf.observer.Observer;
import com.pf.subject.Subject;
/**
 * 观察者2：在初始化对象的时候，自己加到主题类中
 * @author PF
 *
 */
public class ObserverTwo extends Observer{

	public ObserverTwo(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("观察者2...状态值="+this.subject.getState());
	}

}
