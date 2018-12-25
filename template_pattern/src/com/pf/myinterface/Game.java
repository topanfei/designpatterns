package com.pf.myinterface;

/**
 * 游戏的接口类
 * @author Pactera
 *
 */
public abstract class Game {

	/**
	 * 加载游戏
	 */
	public abstract void initialize();
	
	/**
	 * 开始游戏
	 */
	public abstract void startPlay();
	
	/**
	 * 结束游戏
	 */
	public abstract void endPlay();
	
	/**
	 * 模板方法
	 */
	public final void play() {
		this.initialize();
		this.startPlay();
		this.endPlay();
	}
}
