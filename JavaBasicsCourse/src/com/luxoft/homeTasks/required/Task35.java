package com.luxoft.homeTasks.required;

import java.lang.Math;

/*
 * 35.	Дано целое число N (> 1). Если оно является простым, то есть не имеет положительных делителей, кроме 1 и самого себя, 
 * то вывести True, иначе вывести False.
 */

public class Task35 {

	public static void main(String[] args) {
		double n = Double.parseDouble(args[0]);
		if (n < 2) {
			System.out.println("Error. Entered number less than 2.");
		} else if (n % 2 == 0) {
			System.out.println("Error. This number is not a prime number.");
		} else {
			for (int i = 2; i <= Math.round(Math.sqrt(n)); i += 2) {
				if (n % i == 0) {
					System.out.println("Error. This number is not a prime number.");
					break;
				}
				System.out.println("This is prime number");
			}
		}
		

	}
}