package com.luxoft.homeTasks.required;

/*
 * 43.	Дано вещественное число B, целое число N и массив из N целых чисел, упорядоченных по возрастанию. 
 * Вывести элементы массива вместе с числом B, сохраняя упорядоченность выводимых чисел.
 */

public class Task43 {

	public static void main(String[] args) {
		double B = Double.parseDouble(args[0]); //6.123
		int N = Integer.parseInt(args[1]); //10
		int counter = N;
		int[] sequence = new int[N];
		for (int i = 2; i < sequence.length+2; i++){
			sequence[i-2] = Integer.parseInt(args[i]);
		}
		for (int i = 2; i < sequence.length+2; i++){
			if (sequence[i-2] < B){
				System.out.println(sequence[i-2]);
				counter--;
			} else {
				System.out.println(B);
				break;
			}
			
		}
		for (int j = sequence.length - counter; j < sequence.length; j++){
			System.out.println(sequence[j]);
		}

	}

}
