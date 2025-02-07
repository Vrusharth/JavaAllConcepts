package com.company;

public class Recursion {
//    method 1
    static int factorial(int n){
        int fact=1;
        if (n>0){
            for (int i=n;i>0;i--){
                fact*=i;
            }
        }
        else {
            return fact;
        }
        return fact;
    }
//    Method 2 using recursion
    static int factorial2(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{

            return n*factorial2(n-1);
        }
    }

    public static void main(String[] args) {
        int c=factorial(5);
        System.out.println(c);
    }


}
