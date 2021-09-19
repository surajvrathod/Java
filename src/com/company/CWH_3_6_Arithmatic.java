package com.company;

import java.util.Scanner;

public class CWH_3_6_Arithmatic {
    public static void main(String[] args) {
        int a,b,sum,sub,mul,div;
        System.out.println("Perform Addition Subtraction Multiplication Division");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
         a = sc.nextInt();
        System.out.println("enter Second number");
         b = sc.nextInt();
        System.out.println("Please enter your name");
        String str= sc.next();
        System.out.println("Your name is "+str);
         sum=a+b;
         sub=a-b;
         mul=a*b;
         div=a/b;
        System.out.println("The addition of two numbers is "+sum);
        System.out.println("The Subtraction of two numbers is "+sub);
        System.out.println("The Multiplication of two numbers is "+mul);
        System.out.println("The Division of two numbers is "+div);
    }
}
