package com.luxoft.homeTasks.required;

public class Task07
{
    /*
     * Author: Savchuk Yuriy
     *
     * 7.	���� �������� ����������� T � �������� �������. ���������� �������� ���� �� ����������� � 
     * �������� ����������. ����������� �� ������� TC � ����������� �� ���������� TF ������� ��������� 
     * ������������: TC=(TF�32)�5/9. ���� ����������� ������������ ����� ��������� ��������� ������.
     */
    public static void main(String[] args)
    {
        String Arg0 = args[0];
        double tempC = Double.parseDouble(Arg0);
        double tempF = (tempC*9/5)+32;
        System.out.println("������� ����������� " + tempC + " � �������� �������� ��� ������������� " + tempF + " �������� ����������.");
    }
}
