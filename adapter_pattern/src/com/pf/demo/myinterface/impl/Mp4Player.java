package com.pf.demo.myinterface.impl;

import com.pf.demo.myinterface.AdvancedMediaPlayer;

/**
 * 支持Mp4格式的播放器类
 * @author Pactera
 *
 */
public class Mp4Player implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		//什么都不操作
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("播放mp4格式的文件："+fileName);
	}

}
