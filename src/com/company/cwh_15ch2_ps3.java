package com.company;

import java.util.Locale;
import java.util.Scanner;

public class cwh_15ch2_ps3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="   Suraj  ";

        //Q1.Write a Java program to convert a string to lowercase.
        System.out.println(str.toLowerCase());

        //Q2.Write a Java program to replace spaces with underscores.
        System.out.println(str.replace(' ','_'));

        //Q3.Write a Java program to fill in a letter template which looks like below:
        String letter="Dear <|name|>, Thanks a lot!";
        letter=letter.replace("<|name|>","Arun");
        System.out.println(letter);

        //Q4.Write a Java program to detect double and triple spaces in a string.
        String mystring="This string contains  double and   triple spaces";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));

        //Q5.Write a program to format the following letter using escape sequence characters.
        //Letter = “Dear Harry, This Java Course is nice. Thanks”
        System.out.println("\"Dear Harry, This Java Course is nice. Thanks\"");
    }
}
