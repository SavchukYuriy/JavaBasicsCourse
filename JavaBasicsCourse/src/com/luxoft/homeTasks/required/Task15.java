package com.luxoft.homeTasks.required;

public class Task15
{
    /*
     * @Author: Savchuk Yuriy
     * 
     *15.	Дано целое положительное число. Проверить истинность высказывания: 
     *«Данное число является нечетным трехзначным» .
     *
     *Task in English:
     *15. We have odd integer. Check if is true: "This number is three-digit odd." 
     */
    public static void main(String[] args)
    {
        int number = 687;
        if (number < 100) {
            System.out.println("Error. Entered number has less than 3 symbols: " + number); 
        }
        else if (number > 999) {
            System.out.println("Error. Entered number has more than 3 symbols: " + number); 
        }
        else if (number%2 == 0){
            System.out.println("Error. Entered number is three-digit, but even: " + number);
        }
        else {
            System.out.println("Bingo. This number is three-digit and odd: " + number);
        }
    }

}
