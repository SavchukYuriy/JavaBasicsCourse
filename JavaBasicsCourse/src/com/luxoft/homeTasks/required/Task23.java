package com.luxoft.homeTasks.required;

/* 
 * 23.	Мастям игральных карт присвоены порядковые номера: 1 — пики, 2 — трефы, 3 — бубны, 4 — червы.
 *  Достоинству карт, старших десятки, присвоены номера: 11 — валет, 12 — дама, 13 — король, 14 — туз.
 *   Даны два целых числа: N — достоинство (6 ≤ N ≤ 14) и M — масть карты (1 ≤ M ≤ 4). 
 *   Вывести название соответствующей карты вида «шестерка бубен», «дама червей», «туз треф» и т. п.
 * */

public class Task23 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]); // n - is value (6-14)
		int m = Integer.parseInt(args[1]); // m - is suit (1-4)
		String value = "";
		String suit = "";

		switch (n) {
		case 6:
			value = "six";
			break;
		case 7:
			value = "seven";
			break;
		case 8:
			value = "eight";
			break;
		case 9:
			value = "nine";
			break;
		case 10:
			value = "ten";
			break;
		case 11:
			value = "Jack";
			break;
		case 12:
			value = "Lady";
			break;
		case 13:
			value = "King";
			break;
		case 14:
			value = "Ace";
			break;
		default:
			System.out.println("Error. Check the values");
			break;
		}

		switch (m) {
		case 1:
			suit = "spades";
			break;
		case 2:
			suit = "clubs";
			break;
		case 3:
			suit = "diamonds";
			break;
		case 4:
			suit = "hearts";
			break;
		default:
			System.out.println("Error. Check the suit.");
			break;
		}

		System.out.println("Entered numbers. Value: " + n + " Suit: " + m);
		System.out.println("This corresponds to " + value + " " + suit);
	}

}
