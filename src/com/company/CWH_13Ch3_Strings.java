package com.company;

import java.util.Scanner;

public class CWH_13Ch3_Strings {
    public static void main(String[] args) {
        System.out.println("Introduction to Strings");
        Scanner sc = new Scanner(System.in);
        String name=new String("Suraj");
        System.out.println(name);
        String str = "Suraj";
        //Different Ways to print in java

        System.out.print(str);
        System.out.println(str);
        System.out.printf(str);
        System.out.format(str);
        int a=45;float f=45.9f;
        System.out.println();
        System.out.format("The value of a is %d And value of b is %.2f\n",a,f);
        System.out.printf("The value of a is %d And value of b is %.2f",a,f);
    }
}