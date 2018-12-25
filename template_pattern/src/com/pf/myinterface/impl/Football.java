package com.pf.myinterface.impl;

import com.pf.myinterface.Game;

public class Football extends Game{

	@Override
	public void initialize() {
		System.out.println("加载Football...");
	}

	@Override
	public void startPlay() {
		System.out.println("开始Football...");
	}

	@Override
	public void endPlay() {
		System.out.println("结束Football...");
	}


}
