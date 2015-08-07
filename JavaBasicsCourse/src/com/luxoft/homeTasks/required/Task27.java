package com.luxoft.homeTasks.required;

/*
 * 27.	Даны два целых числа A и B (A < B). Найти сумму всех целых чисел от A до B включительно
 * 
 * */

public class Task27 {

	public static void main(String[] args) {
		int a = 4;
		int b = 2500;
		long sum = 0;
		if (a > b) {
			System.out.println("Error. First digit is greater than second.");
		}
		else {
		for (int i = a; i <= b; i++){
			sum += i;
		}
		System.out.println("Sum of all integers from " + a + " to " + b + " is " + sum);
		}
	}

}
