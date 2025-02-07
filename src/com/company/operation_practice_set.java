package com.company;

import java.util.Scanner;

public class operation_practice_set {
    public static void main(String[] args) {
//       wrong answer expected as it is considering the divisions as int
        float a=7/4 * 9/2;
        System.out.println(a);
//        correct way
        float b=7/4f*9/2f;
        System.out.println(b);

        System.out.println("Enter your grades: ");

        char grade ='B';
        grade = (char)(grade+8);
        System.out.println(grade);

//        Decrypt
        grade=(char)(grade-8);
        System.out.println(grade);

//comparison

        Scanner sc =new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println(num1<10);

    }
}
