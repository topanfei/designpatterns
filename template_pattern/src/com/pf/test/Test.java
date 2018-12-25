package com.pf.test;

import com.pf.myinterface.Game;
import com.pf.myinterface.impl.Cricket;
import com.pf.myinterface.impl.Football;

public class Test {

	public static void main(String[] args) {
		Game game = new Cricket();
		game.play();
		
		Game game2 = new Football();
		game2.play();
	}
}
