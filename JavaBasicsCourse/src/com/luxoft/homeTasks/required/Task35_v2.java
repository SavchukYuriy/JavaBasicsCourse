package com.luxoft.homeTasks.required;

public class Task35_v2 {

	public static void main(String[] args) {
		double n = Double.parseDouble(args[0]);
		boolean isPrime = false;
		if (n < 2 || n % 2 == 0) {
			System.out.println(isPrime);
		} else {
			for (int i = 2; i <= Math.round(Math.sqrt(n)); i += 2) {
				if (n % i == 0) {
					System.out.println(isPrime);
					break;
				}
				isPrime = true;
				System.out.println(isPrime);
			}

		}
		
	}

}
