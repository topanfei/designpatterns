package com.pf.demo.myinterface;

/**
 * 媒体播放器接口类<br>
 * 支持播放某种类型的文件方法
 * @author Pactera
 *
 */
public interface MediaPlayer {

	/**
	 * 播放接口
	 * @param audioType 类型
	 * @param fileName 播放文件名称
	 */
	public void play(String audioType,String fileName);
	
}
