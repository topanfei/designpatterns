package com.pf.demo.myinterface.impl;

import com.pf.demo.myinterface.AdvancedMediaPlayer;

/**
 * 支持Vlc格式的播放器类
 * @author Pactera
 *
 */
public class VlcPlayer implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		System.out.println("播放vlc格式的文件："+fileName);
	}

	@Override
	public void playMp4(String fileName) {
		//什么也不做
	}

}
