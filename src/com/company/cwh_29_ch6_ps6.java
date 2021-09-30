package com.company;

public class cwh_29_ch6_ps6 {
    public static void main(String[] args) {
        // Question 1. Create an array of 5 floats and calculate their sum.
        float[] marks={56.9f,39.8f,89.6f,49.9f,73.4f};
        float sum=0;
        for (float i:marks){
            sum=sum+i;
        }
        System.out.println("The sum of all float elements is :" +sum);

       // Question 2. Write a program to find out whether a given integer is present in an array or not.
        int [] a={1,2,3,4,5};
        int t=45;
        boolean b=false;
        for(int i:a){
            if(i==t){
                b=true;
                break;}
        }
        if (b){
            System.out.println("Yes, given number "+t+" is present in array");
        }
        else{
            System.out.println("No, given number "+t+" is not present in array");
        }
        // Question 3.Calculate the average marks from an array containing marks of all students in physics using a for-each loop
         int [] mark={50,70,89,42,48};
        sum=0;
        for(int i:mark){
            sum=sum+i;
        }
        System.out.println("The Average of marks is : "+ (sum/ mark.length));

        // Question 3. Create a Java program to add two matrices of size 2x3.
        int [][] mat1={{1,2,3},
                       {4,5,6}};
        int [][] mat2={{1,2,3},
                       {4,5,6}};
        int [][] result={{0, 0, 0},
                         {0, 0, 0}};;
        System.out.println("Addition of two matrices");
        for (int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
               result[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        //        Printing 2-D Array
        //        for (int[] i : result) {
        //            for (int j : i) {
        //                System.out.print(j + " ");
        //            }
        //            System.out.println();}

        // Question 4. Write a Java program to reverse an array.
        System.out.println("Java program to reverse an array.");
        // Printing array in normal way
            int []arr={1,2,3,4,50,6,7,8,9};
        for (int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        // Printing array in reverse order without changing original array
        System.out.println("Printing array in reverse order without changing original array");
       for (int i=arr.length-1;i!=-1;i--){
           System.out.print(arr[i]+ " ");
       }
        System.out.println();
        //reversing the actual array
        System.out.println("reversing the actual array");
        int l=arr.length;
        int n=Math.floorDiv(arr.length,2);
        int temp;
        for (int i=0;i<n;i++){
            temp=arr[l-1-i];
            arr[l-1-i]=arr[i];
            arr[i]=temp;
        }
        for (int element:arr){
            System.out.print(element +" ");
        }
        System.out.println();

        // Question 5. Write a Java program to find the maximum element in an array.
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        System.out.println("Minimum value an integer can hold is "+min);
        System.out.println("Maximum value an integer can hold is "+max);
        for (int element:arr){
            if(element>min){
                min=element;
            }
        }
        // Question 6. Write a Java program to find the minimum element in an array
        System.out.println("The highest number in given array is "+min);
        for (int element:arr){
            if(element<max){
                max=element;
            }
        }
        System.out.println("The lowest number in given array is "+max);
        // Question 7. Write a Java program to find whether an array is sorted or not
        boolean isSorted=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] < arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }
        }

        }


