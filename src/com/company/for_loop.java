package com.company;

public class for_loop {
    public static void main(String[] args){
        for(int i=1; i<=10; i++){
            System.out.println(String.format("2 X %d = %d",i,2*i));
        }
//First n odd numbers (2*n+1)
        for(int i=0; i<10; i++){
            System.out.println(2*i+1);
        }
        for(int x =5; x>0; x--){
            System.out.println(x);
        }
        int num=50;
        for(int i=1; i<=num; i++){
            System.out.println(i);
        }

//        Break and continue using loops
        int num1=10;
        for(int i=0; i<num1; i++){
            System.out.println("Number is "+i);
            if(i==6){
                System.out.println("Break the loop");
                break;
            }
        }
        for(int i=0; i<num1; i++){
            System.out.println("Number is "+i);
            if(i==6){
                System.out.println("continue the step in the loop "+i);
                continue;
            }
            System.out.println("I did'nt get continue");
        }

    }
}
