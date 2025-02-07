package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Multi_Arrays {
    public static void main(String[] args){
        int  [] marks;
        int [][] flats;
        // 2D array
        flats=new int [2][3]; //2rows and 3 columns
        flats[0][0]=101;
        flats[0][1]=102;
//        flats[0][2]=103;
//        flats[1][0]=201;
//        flats[1][1]=202;
//        flats[1][2]=203;
//        for(int i=0;i< flats.length;i++){
//            for(int j=0;j<flats[i].length;j++){
//                if(flats[i][j]==201){
//                    System.out.println("Hello 201");
//                }
//                System.out.print(flats[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println("");
//        }

        float [] nums={23.4f,5.7f,7.8f,9.0f,6.986f};
        float sum=0;
        for (float elements:nums){
            sum=sum+elements;
        }
        System.out.println("The sum is "+ sum);

//        Scanner sc =new Scanner(System.in);
//        int [] numbers=new int [5];
//        for(int i=0;i< numbers.length;i++){
//            System.out.println("Enter the numbers : ");
//            numbers[i]= sc.nextInt();
//        }
//        for(int j =0;j<numbers.length;j++){
//            if(numbers[j]==43){
//                System.out.println("43 is present in the array");
//                break;
//            }
//
//        }

        float [] PhysicsScore={23.4f,5.7f,7.8f,9.0f,6.986f};
        float add=0;
        for (float elements:PhysicsScore){
            add=add+elements;
        }
        float avg_score=add/PhysicsScore.length;
        System.out.println("Avg score in Physics is: "+avg_score);


    }
}
