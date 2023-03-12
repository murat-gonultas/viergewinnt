package com.github.muratgonultas;

import static com.github.muratgonultas.GameArea.area;

public class WinnerControl {

	public static int isEmpty(int column){
		for(int row = 6; row >= 0; row--){
			if(area[row][column] == ' ')
				return row;
			}
		return -1;
	}

	public static boolean verticallyControl(){

		for (int col = 0; col < 6; col++) {
			for (int row = 0; row < 3; row++) {
				if(area[row][col] != ' ')
					if (area[row][col] == area[row + 1][col] &&
							area[row + 1][col] == area[row + 2][col] &&
							area[row + 2][col] == area[row + 3][col]) {
						System.out.println("we have a winner");
						return true;
					}
				System.out.println("kontrol1");
			}
		}
		System.out.println("kontrol2");
		return false;
	}

	public static boolean horizontallyControl(){ // true means that we have a winner!!!

		for (int row = 0; row < 7; row++) {
			for (int col = 0; col < 3; col++) {
				if(area[row][col] != ' ')
					if (area[row][col] == area[row][col + 1] &&
						area[row][col + 1] == area[row][col + 2] &&
						area[row][col + 2] == area[row][col + 3]) {
					System.out.println("we have a winner");
					return true;
					}
				System.out.println("kontrol1");
			}
		}
		System.out.println("kontrol2");
		return false;
	}

	public static boolean diagonallyControl(){

		for (int row = 0; row < 7; row++) {
			for (int col = 0; col < 3; col++) {
				if(area[row][col] != ' ')
					if (area[row][col] == area[row][col + 1] &&
							area[row][col + 1] == area[row][col + 2] &&
							area[row][col + 2] == area[row][col + 3]) {
						System.out.println("we have a winner");
						return true;
					}
				System.out.println("kontrol1");
			}
		}
		System.out.println("kontrol2");
		return true;
	}
}
