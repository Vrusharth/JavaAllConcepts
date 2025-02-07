package com.company;

import java.util.Scanner;

public class percent_cal {
    public static void main(String[] args) {
        System.out.println("Welcome Dear Student!");
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter subject 1 marks");
        int sub1=sc.nextInt();

        System.out.println("Enter subject 2 marks");
        int sub2=sc.nextInt();

        System.out.println("Enter subject 3 marks");
        int sub3=sc.nextInt();

        System.out.println("Enter subject 4 marks");
        int sub4=sc.nextInt();

        System.out.println("Enter subject 5 marks");
        int sub5=sc.nextInt();

        float percentage =((sub1+sub2+sub3+sub4+sub5)/500f)*100;
        System.out.println("Your average marks are \n");
        System.out.println(percentage);



    }
}
