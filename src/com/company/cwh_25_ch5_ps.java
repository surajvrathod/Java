package com.company;

public class cwh_25_ch5_ps {
    public static void main(String[] args) {
        //Question 1: Write a program to print the following pattern :
        // ****
        // ***
        // **
        // *
        System.out.println("printing Star pattern");
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Question 2: Write a program to sum first n(10) even numbers using a while loop.
        int n = 10, sum = 0;
        System.out.print("Sum Of first " + n + " even numbers is: ");
        while (n >= 0) {
            sum = sum + (2 * n);
            n--;
        }
        System.out.println(sum);
        //Question 3: Write a program to print the multiplication table of a given number n.
        System.out.println("program to print the multiplication table of a given number n.");
        int m = 1, s = 7;
        while (m <= 10) {
            System.out.println(m * s);
            m++;
        }
        //Question 4: Write a program to print a multiplication table of 10 in reverse order.
        System.out.println("program to print a multiplication table of 10 in reverse order.");
        int t = 10, r = 10;
        while (t > 0) {
            System.out.println(t * r);
            t--;
        }
        //Question 5: Write a program to find the factorial of a given number using for loops.
        int fact1 = 1, num1 = 10;
        System.out.print("Factorial Of " + num1 + " using for loop is: ");
        for (int i = 1; i <= num1; i++) {
            fact1 = fact1 * i;
        }
        System.out.println(fact1);
        //Question 6: Write a program to find the factorial of a given number using for loops.
        int fact = 1, num = 10;
        System.out.print("Factorial Of " + num + " using while loop is: ");
        while (num > 0) {
            fact = fact * num;
            num--;
        }
        System.out.println(fact);
        //Question 7: Write a program to print the following pattern :
        // ****
        // ***
        // **
        // *
        System.out.println("program to print the Star pattern");
        int d=5;
        while(d>0) {
            for (int i = 1; i <= d; i++) {
                System.out.print("*");
            }
            System.out.println();
            d--;
        }
            //Question 8: What can be done using one type of loop can also be done using the other two types of loops -
            // True or False.
            //Answer:True.

            //Question 9: Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
            int tableOf8=8,SumOf8=0;
        System.out.print("the sum of the numbers occurring in the multiplication table of "+tableOf8+" is :");
            for (int i=1;i<=10;i++){
                SumOf8=SumOf8+(tableOf8*i);
            }
            System.out.println(SumOf8);

            //Question 10 :A do-while loop is executed:
            //       At least once
            //       At least twice
            //      At most once
            // Answer:At Least Once
        //Question 11: Write a program to sum first n even numbers using a for loop.
        int sum3=0,n1=10;
        System.out.print("sum first "+n1+" even numbers using a for loop is :");
        for(int i=1;i<=n1;i++){
            sum3=sum3+(2*i);
        }
        System.out.println(sum3);

        }
    }

