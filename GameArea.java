package com.github.muratgonultas;

public class GameArea {

	public static char[][] area = new char[7][6];

	public void setArea() {
		for (int row = 0; row < 7; row++) {
			for (int col = 0; col < 6; col++) {
				area[row][col] = ' ';
			}
		}
	}

	public void getArea(){
		numeratorHorizontal();
		for (int row = 0; row < 7; row++) {
			System.out.println("____________________________________");
			for (int col = 0; col < 6; col++) {
				System.out.print("|  " +area[row][col] + " |");
			}
			System.out.println();
		}
	}

	public void numeratorHorizontal(){
		System.out.println();
		System.out.println("|  1  |  2  |  3  |  4  |  5  |  6 |");

	}

	public void setChips(Player pl){
		int col = pl.throwChip(pl);
		int row = WinnerControl.isEmpty(col);
		if( row != -1)
			area[row][col] = pl.playerChip;

	}


}
