package com.luxoft.homeTasks.required;

public class Task15
{
    /*
     * @Author: Savchuk Yuriy
     * 
     * 15.	Дано целое положительное число. Проверить истинность высказывания:
     *  «Данное число является нечетным трехзначным»
     */
    public static void main(String[] args)
    {
        int number = 687;
        if (number < 100) {
            System.out.println("Ошибка. Число меньше 100: " + number); 
        }
        else if (number > 999) {
            System.out.println("Ошибка. Введено четырехзначное число: " + number); 
        }
        else if (number%2 == 0){
            System.out.println("Ошибка. Введено четное трехзначное число: " + number);
        }
        else {
            System.out.println("Данное число является нечетным трехзначным: " + number);
        }
    }

}
