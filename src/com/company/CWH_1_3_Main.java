package com.company;

import java.util.Scanner;

public class CWH_1_3_Main {

    public static void main(String[] args) {
System.out.println("Addition of two numbers");
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(str);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter Second number");
        int b = sc.nextInt();
        int sum=a+b;
        System.out.println("The addition of two numbers is "+sum);
    }
}
