package com.pf.demo.myinterface.impl;

import com.pf.demo.adapter.MediaAdapter;
import com.pf.demo.myinterface.MediaPlayer;

/**
 * 需求：假设该类之前只能播放MP3文件，现在加了MediaAdapter适配器后，也能播放mp4和vlc文件了。
 * @author Pactera
 *
 */
public class MediaPlayerImpl implements MediaPlayer {

	private MediaAdapter adapter;
	
	@Override
	public void play(String audioType, String fileName) {
		if("mp3".equalsIgnoreCase(audioType)) {
			System.out.println("播放MP3格式的文件："+fileName);
		}else if("vlc".equalsIgnoreCase(audioType)) {
			adapter = new MediaAdapter(audioType);
			adapter.play(audioType, fileName);
		}else if("mp4".equals(audioType)) {
			adapter = new MediaAdapter(audioType);
			adapter.play(audioType, fileName);
		}else {
			System.out.println("其他格式，暂不支持");
		}
	}

}
