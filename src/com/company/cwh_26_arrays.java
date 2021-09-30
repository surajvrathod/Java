package com.company;

public class cwh_26_arrays {
    public static void main(String[] args) {
        //Accessing Array Elements :
        //There Are 3 ways to access the Array elements in java,
        //     1>   int[] marks;                 //Declaration!
        //          marks = new int[5];           //Memory allocation!

        //    2>    int[] marks = new int[5];    //Declaration + Memory allocation!
        //    3>    int[] marks = {100,70,80,71,98}   // Declare + Initialize!
        //    Quick Quiz: Storing marks of 5 students
        System.out.println("Storing marks of 5 students");
        int [] marks=new int[5];
              marks[0]=98;
              marks[1]=90;
              marks[2]=100;
              marks[3]=50;
              marks[4]=80;
        //  1> Printing Array in naive way
        System.out.println("Printing Array in naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println("Length Of Marks Array is "+marks.length);
        //  2> Printing array using for loop
        System.out.println("Printing array using for loop");
        for(int i=0;i< marks.length;i++) System.out.println(marks[i]);

        //  3> Printing array using for each loop
        System.out.println("Printing array using for each loop");
        int []mark={99,56,78,97,85,89,78};
      for (int j: mark ) System.out.println(j); //For each loop
    }
}
