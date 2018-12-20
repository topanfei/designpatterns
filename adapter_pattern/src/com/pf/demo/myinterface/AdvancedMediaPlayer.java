package com.pf.demo.myinterface;

/**
 * 高等的播放器
 * @author Pactera
 *
 */
public interface AdvancedMediaPlayer {

	/**
	 * 播放Vlc格式的文件
	 * @param fileName
	 */
	public void playVlc(String fileName);
	
	/**
	 * 播放mp4格式的文件
	 * @param fileName
	 */
	public void playMp4(String fileName);
}
