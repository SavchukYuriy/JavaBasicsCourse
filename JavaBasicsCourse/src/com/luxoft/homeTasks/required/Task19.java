package com.luxoft.homeTasks.required;

/**
 * 19.	Даны координаты двух различных полей шахматной доски x1, y1, x2, y2 
 * (целые числа, лежащие в диапазоне 1–8). Проверить истинность высказывания: 
 * «Ладья за один ход может перейти с одного поля на другое».
 * 
 * In English:
 * We have coordinates of two different squares of the chessboard x1, y1, x2, y2
 * (integer in limits 1-8). Check if is true: "Rook can move to the second square in one step"
 */

public class Task19 {

	public static void main(String[] args) {
		int x1 = Integer.parseInt(args[0]);
		int y1 = Integer.parseInt(args[1]);
		int x2 = Integer.parseInt(args[2]);
		int y2 = Integer.parseInt(args[3]);
		
		if (x1 < 1 || y1 < 1 || x2 < 1 || y2 < 1){
			System.out.println("Error. One of coordinates is less than 1.");
		}
		if (x1 > 8 || y1 > 8 || x2 > 8 || y2 > 8){
			System.out.println("Error. One of coordinates is more than 8.");
		}
		if (x1 == x2 || y1 == y2){
			System.out.println("Rook can move to the second square in one step.");
		} else {
			System.out.println("To make move rook take two or more steps.");
		}

	}

}
