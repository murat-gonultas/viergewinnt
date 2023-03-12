package com.github.muratgonultas;

import java.util.Random;
import java.util.Scanner;

public class Player {

	private String name;
	private int id;
	public char playerChip;

	public Player(int id){
		System.out.println("pls give your name:");
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		this.id = id;
		if(id == 1)
			playerChip = 'X';
		else
			playerChip = 'O';
	}



	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}


	public static int randomPlayer(){ // this function was written to connect the game to the luck factor
		Random r = new Random();
		int result = r.nextInt(1,3);
		return result;
	}

	public Player chancePlayer(Player pl, Player pl1, Player pl2){

		if(pl == pl1){
			pl = pl2;
		}
		else {
			pl = pl1;
		}
		return pl;

	}


	public int throwChip(Player player){
		System.out.println(player.getName() +" Pls choise a column");
		Scanner kb = new Scanner(System.in);
		int column = kb.nextInt();
		return column - 1;
	}


}
