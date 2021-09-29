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
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println("Length Of Marks Array is "+marks.length);

        int []mark={99,56,78,97,85,89,78};
       // for(int i=0;i< mark.length;i++) System.out.println(mark[i]);
      for (int j: mark ) System.out.println(j);
    }
}
