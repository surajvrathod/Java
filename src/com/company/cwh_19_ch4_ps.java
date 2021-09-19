package com.company;

import java.util.Scanner;

public class cwh_19_ch4_ps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Question 1 : What will be the output of this program:
        int a=10;
        if(a==11)
            System.out.println("I am 11");
        else
            System.out.println("I am not 11");

        //Question 2: Write a program to find out whether a student is pass or fail; if it requires a total of 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as input from the user.
        System.out.println("Enter your marks in Physics");
        float physics=sc.nextFloat();
        System.out.println("Enter your marks in Chemistry");
        float chemistry=sc.nextFloat();
        System.out.println("Enter your marks in Biology");
        float biology=sc.nextFloat();
        float percentage=(physics+chemistry+biology)/3;
        if(physics>=33 && chemistry>=33 && biology>=33)
            if (percentage>=40)
                System.out.println("Congratulations, You are passed with "+percentage+"%");
            else
                System.out.println("Sorry,You are failed");
        else
            System.out.println("Sorry,You are failed");
    }
}
