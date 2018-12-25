package com.pf.myinterface.impl;

import com.pf.myinterface.Game;

public class Cricket extends Game{

	@Override
	public void initialize() {
		System.out.println("正在加载Cricket...");
	}

	@Override
	public void startPlay() {
		System.out.println("开始Cricket...");
	}

	@Override
	public void endPlay() {
		System.out.println("结束Cricket...");
	}


}
