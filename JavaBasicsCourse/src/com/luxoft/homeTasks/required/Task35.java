package com.luxoft.homeTasks.required;

/*
 * 35.	Дано целое число N (> 1). Если оно является простым, то есть не имеет положительных делителей, кроме 1 и самого себя, 
 * то вывести True, иначе вывести False.
 */

public class Task35 {

	public static void main(String[] args) {
		int n = 17;
		int counter = 0;
		if (n < 2){
			System.out.println("Error. Entered number less than 2.");
		} 
		for (int i = 2; i <= n; i++){
			if (n%i == 0){
				counter++;
			}
		}
		if (counter > 1) {
			System.out.println("False. Number has a several dividers.");
		} else if (counter == 1) {
			System.out.println("True. This is a prime number.");
		} else {
			System.out.println("Error. Something going wrong.");
		}
	}
}
