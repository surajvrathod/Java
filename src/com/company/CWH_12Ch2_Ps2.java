package com.company;

import java.util.Scanner;

public class CWH_12Ch2_Ps2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Q1.What will be the output of following Expression
        float h=7/4.0f*9/2.0f;
        System.out.println(h);

        //Q.2 Grade Encryption by Grade+8
        char grade='B';
        grade= (char) (grade+8);
        System.out.println(grade);
        //Decrypting the above
        grade= (char) (grade-8);
        System.out.println(grade);

        //Q.3 Use comparison to check user input
        int p=sc.nextInt();
        System.out.println(p>10);

        //Q.4 What will be the output of following expression
        int v=2,u=1,a=1,s=1;
        float f=(v*v-u*u)/(2.0f*a*s);

        //Q.5 what will be the output of following expression
        int x=7;
        int l=7*49/7+35/7;
        System.out.println(l);



    }
}
