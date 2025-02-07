package com.company;
import  java.util.Scanner;
public class user_input {
    public static void main(String[] args) {
        System.out.println("It works!");
        System.out.println("Taking input from user");
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter num 1");
//        int a =sc.nextInt();
////        float a=sc.nextFloat();
//        System.out.println("Enter num 2");
//        int b =sc.nextInt();
////        float b=sc.nextFloat();
//        int sum=a+b;
//        System.out.println(sum);
        boolean B1=sc.hasNextBigInteger();
        System.out.println(B1);


    }
}
