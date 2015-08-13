package com.luxoft.homeTasks.required;

/*
 * 47.	Дан массив из N целых чисел. Найти их сумму. Расчет суммы массива реализовать в виде функции.
 */

public class Task47 {

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]); 
		int[] sequence = new int[N];
		for (int i = 1; i <= sequence.length; i++){
			try {
				sequence[i-1] = Integer.parseInt(args[i]);
			} catch (Exception e) {
				System.out.println("Check number of arguments.");
				e.printStackTrace();
			}
		}
		System.out.println("Sum of entered numbers is: " + sum(sequence));

	}
	
	public static long sum(int[] massiv){
		long x = 0;
		for (int i = 0; i < massiv.length; i++){
			x += massiv[i];
		}
		return x;
	}

}
