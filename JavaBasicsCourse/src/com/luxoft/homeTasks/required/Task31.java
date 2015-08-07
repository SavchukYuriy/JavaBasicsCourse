package com.luxoft.homeTasks.required;

/*
 * 31.	Дано целое число N (> 0). Найти произведение N! = 1•2•…•N (N–факториал). Чтобы избежать целочисленного
 *  переполнения, вычислять это произведение с помощью вещественной переменной и вывести его как вещественное число.
 */

public class Task31 {

	public static void main(String[] args) {
		int n = 5;
		double factor = 1d;
		if (n < 0) {
			System.out.println("Error. Number less than a zero");
		} else {
			for (int i = 1; i <= n; i++){
				factor *= i;
			}
			System.out.println("Factorial of the number " + n + " is " + factor);
		}

	}

}
