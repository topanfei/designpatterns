package com.pf.subject;

import java.util.ArrayList;
import java.util.List;

import com.pf.observer.Observer;

/**
 * 被观察的类：当该类的state改变时会通知所有的观察者
 * @author PF
 *
 */
public class Subject {

	private List<Observer> observerList = new ArrayList<Observer>();//观察者的集合
	private int state;//状态
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}
	
	public void attach(Observer observer) {
		observerList.add(observer);
	}
	
	public void notifyAllObservers() {
		for (Observer observer : observerList) {
			observer.update();
		}
	}
}
