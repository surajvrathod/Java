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

        /* Question 3 :Calculate income tax paid by an employee to the government as per the slabs mentioned below:

        Income Slab	Tax
        2.5L – 5.0L  	5%
        5.0L – 10.0L 	20%
        Above 10.0L	30%
        Note that there is not tax below 2.5L. Take the input amount as input from the user. */
        System.out.println("Enter your in lakhs");
        float salary =sc.nextFloat();
        float tax=0.0f;
        if(salary<2.5)
            System.out.println("You are exempted for tax");
        else if(salary>=2.5 && salary<=5)
        {
            tax=salary*5000f;
            System.out.println("Tax to be paid is "+tax+" Rupees");
        }
        else if(salary>=5 && salary<=10)
        {
            tax=salary*20000f;
            System.out.println("Tax to be paid is "+tax+" Rupees");
        } else if(salary>=10 )
        {
            tax=salary*30000f;
            System.out.println("Tax to be paid is "+tax+" Rupees");
        }

        //Question 4: Write a Java program to find out the day of the week given the number [1 for Monday, 2 for Tuesday … and so on!]


//        System.out.println("Please Enter 1 to 7");
//        int day= sc.nextInt();
//        switch (day){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//                case 3:
//                System.out.println("Wednesday");
//                break;
//                case 4:
//                System.out.println("Thursday");
//                break;
//                case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Please Enter valid input");
//                break;
//              }

                //Question 5:Write a Java program to find whether a year entered by the user is a leap year or not.
            System.out.println("Please Enter the year");
            int year=sc.nextInt();
            if(year%100==0 && year%400==0 || year%100!=0 &&year % 4 == 0){
                System.out.println("Leap Year");
            }
            else
            {
                System.out.println("Not a Leap year");
            }

            //Question 6:Write a program to find out the type of website from the URL:
        //
        //.com – commercial website
        //.org – organization website
        //.in – Indian website
        System.out.println("Please enter your website");
            String website= sc.next();

            if (website.endsWith(".com")){
                System.out.println("Entered website is a Commercial Website");

        }
        else if (website.endsWith(".org")){
            System.out.println("Entered website is a orgnizational Website");

        }
        if (website.endsWith(".in")){
            System.out.println("Entered website is a indian Website");
        }

        }

    }
