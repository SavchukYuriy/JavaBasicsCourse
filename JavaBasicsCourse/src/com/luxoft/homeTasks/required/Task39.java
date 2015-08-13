package com.luxoft.homeTasks.required;

/*
 * 39.	Дан массив из десяти целых чисел. Найти их произведение.
 */

public class Task39 {

	public static void main(String[] args) {
		int[] sequence = new int[10];
		for (int i = 0; i < sequence.length; i++){
			sequence[i] = Integer.parseInt(args[i]);
			if (sequence[i] == 0){
				System.out.println("Atention. " + (i+1) + "-th element from entered elements is equal to zero.");
			}
		}
		long product = 1;
		for (int i = 0; i < sequence.length; i++){
			product *= sequence[i];
		}
		System.out.println("The product of entered massiv equals = " + product);

	}

}
