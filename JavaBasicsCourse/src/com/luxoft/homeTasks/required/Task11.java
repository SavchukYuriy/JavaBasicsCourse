package com.luxoft.homeTasks.required;

/**
 * 11.	Дано двузначное число. Вывести число, полученное при перестановке цифр исходного числа. 
 * Решить задачу, не использую никаких дополнительных переменных.
 */
public class Task11 {
    public static void main(String[] args) {
        int a = 57;
        a = ((a%10)*10 + (a/10));
        System.out.println("revert of a number is - " + a);
    }
}
