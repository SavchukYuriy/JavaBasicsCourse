package com.luxoft.homeTasks.required;

/* 
 * 23.	Мастям игральных карт присвоены порядковые номера: 1 — пики, 2 — трефы, 3 — бубны, 4 — червы.
 *  Достоинству карт, старших десятки, присвоены номера: 11 — валет, 12 — дама, 13 — король, 14 — туз.
 *   Даны два целых числа: N — достоинство (6 ≤ N ≤ 14) и M — масть карты (1 ≤ M ≤ 4). 
 *   Вывести название соответствующей карты вида «шестерка бубен», «дама червей», «туз треф» и т. п.
 * */

public class Task23_v2 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]); // n - is value (6-14)
		int m = Integer.parseInt(args[1]); // m - is suit (1-4)
		String[] deck = {"", "spades", "clubs", "diamonds", "hearts", "", 
				"six", "seven", "eight", "nine", "ten", "Jack", "Lady", "King", "Ace"};
		if (m < 1 || m > 4 || n < 6 || n > 14){
			System.out.println("Error. Check the arguments. (value 6-14, suit 1-4)");
		}
		for (int i = 1; i <= deck.length; i++){
			if (i == m){
				System.out.print(deck[i] + " ");
			} else if (i == n){
				System.out.println(deck[i]);
			}
			
		}
	}

}
