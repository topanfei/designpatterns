package com.pf.demo.adapter;

import com.pf.demo.myinterface.AdvancedMediaPlayer;
import com.pf.demo.myinterface.MediaPlayer;
import com.pf.demo.myinterface.impl.Mp4Player;
import com.pf.demo.myinterface.impl.VlcPlayer;

/**
 * 适配器，整合播放vlc/mp4格式的播放器。用于MediaPlayerImpl类中
 * @author Pactera
 *
 */
public class MediaAdapter implements MediaPlayer{
	
	private AdvancedMediaPlayer player;
	
	/**
	 * 构造方法：用于创建vlc或者mp4格式的播放器对象
	 * @param audioType
	 */
	public MediaAdapter(String audioType) {
		if("vlc".equalsIgnoreCase(audioType)) {
			player = new VlcPlayer();
		}else if("mp4".equalsIgnoreCase(audioType)) {
			player = new Mp4Player();
		}
	}
	
	@Override
	public void play(String audioType, String fileName) {
		if("vlc".equalsIgnoreCase(audioType)) {
			player.playVlc(fileName);
		}else if("mp4".equalsIgnoreCase(audioType)) {
			player.playMp4(fileName);
		}
	}
}
