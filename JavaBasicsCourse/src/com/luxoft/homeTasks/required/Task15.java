package com.luxoft.homeTasks.required;

public class Task15
{
    /*
     * @Author: Savchuk Yuriy
     * 
     * 15.	���� ����� ������������� �����. ��������� ���������� ������������:
     *  ������� ����� �������� �������� �����������
     */
    public static void main(String[] args)
    {
        int number = 687;
        if (number < 100) {
            System.out.println("������. ����� ������ 100: " + number); 
        }
        else if (number > 999) {
            System.out.println("������. ������� �������������� �����: " + number); 
        }
        else if (number%2 == 0){
            System.out.println("������. ������� ������ ����������� �����: " + number);
        }
        else {
            System.out.println("������ ����� �������� �������� �����������: " + number);
        }
    }

}
