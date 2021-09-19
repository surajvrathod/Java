package com.company;
import java.util.Scanner;
public class CWH_14_Stringmethods {
    public static void main(String[] args) {
        System.out.println("Perform Different String Operations");
        Scanner sc= new Scanner(System.in);
        String name="Suraj";
        String modified_name="      Suraj    ";
        System.out.println(name);  //Suraj
        System.out.println(modified_name); //    Suraj
        System.out.print("Length of String \""+name +"\" is:");
        System.out.println(name.length());    //5
        System.out.println(name.toLowerCase()); //suraj
        System.out.println(name.toUpperCase());  //SURAJ
        System.out.println(name.indexOf('j')); //4
        System.out.println(name.indexOf("raj"));  //2
        System.out.println(name.indexOf('a',2)); //3
        System.out.println(name.lastIndexOf('a')); //2
        System.out.println(name.lastIndexOf("ur",5)); //1
        System.out.println(name.charAt(3));  //'a'
        System.out.println(modified_name.trim());  //Suraj
        System.out.println(name.substring(2));  //raj
        System.out.println(name.substring(1,4)); //ura
        System.out.println(name.replace('u','a'));  //Saraj
        System.out.println(name.replace("Su","Dhi")); //Dhiraj
        System.out.println(name.startsWith("Su"));  //true
        System.out.println(name.startsWith("dhi"));  //false
        System.out.println(name.endsWith("raj"));   //true
        System.out.println(name.equals("Suraj"));   //true
        System.out.println(name.equalsIgnoreCase("sURAj")); //true
    }
}
