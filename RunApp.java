package com.github.muratgonultas;

import java.util.Random;
import java.util.Scanner;

public class RunApp {

	public static void gameIntro(){
		System.out.println("|-------------------------------------GAME INTRO----------------------------------------|");
		System.out.println("|---------------------------------------------------------------------------------------|");

		System.out.println("|	1.	The game starts when the first player throws his chip into the desired column.	|\n" +
				"|	2.	Then the turn passes to the other player.										|\n" +
				"|	3.	The X sign represents the chip of the first player								|\n" +
				"|		and the O sign represents the chip of the second player.						|\n"+
				"|	4.	Whichever player brings his 4 jeeps horizontally, vertically or diagonally wins.|");
		System.out.println("|---------------------------------------------------------------------------------------|");
		System.out.println("|------------------------------------GOOD LUCK------------------------------------------|");
	}


	public static void main(String[] args) {

		GameArea gameArea = new GameArea();
		gameIntro();

		Player player;
		Player player1 = new Player(1);
		Player player2 = new Player(2);
		if(Player.randomPlayer() == 1)
			player = player1;
		else
			player = player2;


		gameArea.setArea();
		gameArea.getArea();
		gameArea.setChips(player);

		while(!WinnerControl.totalWinControl()){

			gameArea.getArea();
			player = Player.chancePlayer(player, player1, player2);
			gameArea.setChips(player);
			//WinnerControl.horizontallyControl();
			//WinnerControl.verticallyControl();
			//WinnerControl.diagonallyControl();
			//WinnerControl.totalWinControl();
		}




	}

}
