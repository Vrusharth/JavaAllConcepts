package com.company;

public class varargs {
    //      Why var args ?
//    static int add(int a, int b){
//        return a+b;
//    }
//    static int add(int a, int b,int c){
//        return a+b+c;
//    }
//    static int add(int a, int b,int c,int d){
//        return a+b+c+d;
//    }
    static int sum(int ...arr){
//        Available as int [] arr
        int result=0;
        for(int a:arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to var args tutorial");

        System.out.println("Add 4 and 3: "+sum(4,3));
        System.out.println("Add 4,3 and 5: "+sum(4,3,5));
        System.out.println("Add 4,3,5 and 6: "+sum(4,3,5,6));
//        Instead of making so many methods doing similar operation
//        we can reduce the efforts by using for each loop.
    }
}
