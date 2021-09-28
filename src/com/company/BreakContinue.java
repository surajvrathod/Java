package com.company;

public class BreakContinue {
    public static void main(String[] args) {
        //Print number from 1 to 10
        for (int i=1;i<=10;i++){
            System.out.println(i);
            if (i==5){
                System.out.println("I am "+i+" and I am breaking the loop");
                break;
                //Break instruction will terminate the loop whether condition is true or false
                //Break statement will transfer the control to the next line
            }
        }
        System.out.println("Out of loop");
        for (int i=1;i<=10;i++){
            if (i==5){
                continue;
            }
            System.out.println(i);
            System.out.println("Java Is Great Language");
        }
    }
}
