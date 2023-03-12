package com.github.muratgonultas;

import java.util.Random;
import java.util.Scanner;

public class RunApp {

	public static void gameIntro(){
		System.out.println("The game starts when the first player throws his chip into the desired column.\n" +
				"Then the turn passes to the other player. The X sign represents the chip of the first player" +
				" and the O sign represents the chip of the second player.\n" +
				"Whichever player brings his 4 jeeps horizontally, vertically or diagonally wins." +
				"GOOD LUCK!!!");
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		GameArea gameArea = new GameArea();
		gameIntro();

		Player player = new Player(0);
		Player player1 = new Player(1);
		Player player2 = new Player(2);
		player = player1;

		gameArea.setArea();

		gameArea.getArea();
		gameArea.setChips(player);

		while(true){
			gameArea.getArea();
			player = player.chancePlayer(player, player1, player2);
			gameArea.setChips(player);
			//WinnerControl.horizontallyControl();
			WinnerControl.verticallyControl();

		}

	}

}
