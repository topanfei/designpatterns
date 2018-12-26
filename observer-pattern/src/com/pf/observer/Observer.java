package com.pf.observer;

import com.pf.subject.Subject;

/**
 * 观察者抽象类
 * @author PF
 *
 */
public abstract class Observer {
	
	protected Subject subject;//被观察的类
	
	public abstract void update();
}
