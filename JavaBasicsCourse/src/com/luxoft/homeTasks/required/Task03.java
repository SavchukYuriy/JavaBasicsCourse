package com.luxoft.homeTasks.required;

/* @author Savchuk Yuriy
 * 
 * Goal: 3. Даны переменные A, B, C. Изменить их значения, переместив 
 * содержимое A в C, C — в B, B — в A, и вывести новые значения переменных 
 * A, B, C.
 */

public class Task03 {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c = 7;
		int tmp;
		System.out.println("Initial order: " + a + " " + b + " " + c);
		tmp = c;
		c = a;
		a = b;
		b = tmp;
		System.out.println("Resulting order: " + a + " " + b + " " + c);
	}

}
/*Result output: 
 *  Initial order: 3 5 7
 *  Resulting order: 5 7 3
 */