package com.company;

import java.util.Scanner;

public class CWH_7Ch1_Ps1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Q1. Write a program to sum three numbers in Java.
        int a=46;
        int b=98;
        int c=98;
        int d=a+b+c;
        System.out.println(d);

        //Q2.Write a program to calculate CGPA using marks of three subjects (out of 100)
        System.out.println("Please enter your marks in each subject");
        int e= sc.nextInt();
        int f= sc.nextInt();
        int g= sc.nextInt();
        int h= sc.nextInt();
        int i= sc.nextInt();
        float j=(e+f+g+h+i)/50.0f;
        System.out.println(j);

        //Q3.Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.
        System.out.println("What is your name");
        String name=sc.next();
        System.out.println("Good Morning "+name+",Have a good day!"
        );
        //Q4.Write a Java program to convert Kilometers to miles.
        System.out.println("please Enter the kilometer");
        float km=sc.nextFloat();
        float ml=(km*5)/8;
        System.out.println("The kilometer in miles is "+ml);
        System.out.println("please Enter the miles");
        float mile=sc.nextFloat();
        float kilo=(mile*8)/5;
        System.out.println("The miles in kilometer is "+kilo);

        //Q5.Write a Java program to detect whether a number entered by the user is an integer or not.
        System.out.println(sc.hasNextInt());
    }
}
