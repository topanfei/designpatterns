package com.pf.demo.test;

import com.pf.demo.myinterface.MediaPlayer;
import com.pf.demo.myinterface.impl.MediaPlayerImpl;

public class Test {

	public static void main(String[] args) {
		MediaPlayer player = new MediaPlayerImpl();
		player.play("mp3", "aa.mp3");
		player.play("mp4", "bb.mp4");
		player.play("vlc", "cc.vlc");
		player.play("doc", "dd.doc");
	}
}
