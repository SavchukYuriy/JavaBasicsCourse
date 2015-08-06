package com.luxoft.homeTasks.required;

public class Task07
{
    /*
     * Author: Savchuk Yuriy
     *
     * 7.	ƒано значение температуры T в градусах ÷ельси€. ќпределить значение этой же температуры в 
     * градусах ‘аренгейта. “емпература по ÷ельсию TC и температура по ‘аренгейту TF св€заны следующим 
     * соотношением: TC=(TFЦ32)Х5/9. ¬вод температуры организовать через параметры командной строки.
     */
    public static void main(String[] args)
    {
        String Arg0 = args[0];
        double tempC = Double.parseDouble(Arg0);
        double tempF = (tempC*9/5)+32;
        System.out.println("¬ведена температура " + tempC + " в градусах ÷ельси€В что соответствует " + tempF + " градусам ‘аренгейта.");
    }
}
