package com.company;

public class SimpleLoops {
    public static void main(String[] args) {
        //Simple Approach to print  1 to 10 natural numbers
        System.out.println("Simple Approach to print  1 to 10 natural numbers");
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);

        //Print 1 to 10 natural numbers using while loops
        System.out.println("Print 1 to 10 natural numbers using while loops");
        int a=1;
        while(a<=10){
            System.out.println(a);
            a++;
        }

        //Print 1 to 10 natural numbers using  do while loops
        System.out.println("Print 1 to 10 natural numbers using do while loops");
        int b=1;
        do {
            System.out.println(b);
        }while(b<1);
         //In above example the given condition is not true but still above code executes once

        //when we know that how many iteration is to be performed then we use for loop
        System.out.println("Print N natural even numbers using For Loop");
        int c=10;
        for (int i=0;i<10;i++){
            System.out.println(2*i);
        }
        //Printing N natural odd numbers using For Loop can be done by adding 1 to given formula 2n+1.
        //Print N natural reverse numbers upto certain limit
        System.out.println("Print N natural reverse numbers upto certain limit");
        int d=34;
        for (int i=d;i>0;i--){
            System.out.println(i);
        }

    }
}
