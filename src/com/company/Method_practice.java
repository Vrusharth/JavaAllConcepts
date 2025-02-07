package com.company;

public class Method_practice {
    static void table1(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d * %d = %d\n",n,i,n*i);
        }
        }



// Problem 2
//*
//**
//***
//****
//*****
    static void pattern(int n ){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }

//    Problem 3
//    Recursive function to find sum of first n natural numbers using recursion

    static int sum(int n){
        if(n==1){
            return 1;
        }else{
        return n+sum(n-1);
        }
    }

//    Problem 4
//    Write a function to print following pattern
//    *****
//    ****
//    ***
//    **
//    *

    static void pattern2(int n){
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    Problem 5
//    Print the nth term of fibonacci
    static int fibonacci(int n){
        if(n==1){
            return 0;
        } else if (n==2) {
            return 1;
        } else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }

    //    Problem 5
//  Avg of number using varargs

    static float avg(int ... arr){
        float sum=0f;
        float i=arr.length;
        for(int element:arr){
            sum+=element;
        }
        return sum/i;
    }

//Problem 6
//    Pattern using recursion
//*
//**
//***
    static boolean pattern_rec(int n){
        if(n>0){
            pattern_rec(n-1);
            for(int i=0;i < n;i++){
                System.out.print("*");
            }
            System.out.println();
        }

        return false;
    }
    // pattern_rec(3):
    // pattern_rec(2) + 3 times star
    // pattern_rec(1) + 2 times star + 3 times star
    //*
    //**
    //***

    //Problem 7
    // Celsius to fahrenheit
    static float temp(float n){
        return (1.8f*n)+32;
    }

    public static void main(String[] args) {
//        pattern(4);
//        pattern(5);
//        int sum1=sum(5);
//        System.out.println(sum1);
//        pattern2(5);

        System.out.println(avg(2,1,2));
        System.out.println(pattern_rec(5));
        System.out.println("The 32 Degree C in Fahrenheit is :  " + temp(32) + "F");
    }

}
