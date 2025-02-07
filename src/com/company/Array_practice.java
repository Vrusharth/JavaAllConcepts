package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_practice {
    public static void main(String[] args) {
//        Eg. Sum of two matrices of size 2X3
        int [][] mat1={{1,2,3},
                       {4,5,6}};
        int [][] mat2={{1,2,3},
                       {4,5,6}};
        int [][] sum_mat={{0,0,0},
                          {0,0,0}};
        for (int i=0;i<mat1.length;i++){//row number of times
            for(int j=0;j< mat1[i].length;j++){//column number of times


                sum_mat[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(sum_mat[i][j]+" ");
            }
            System.out.println("");
        }

//        Reverse the array
        int [] plain={1,2,3,4,5};
//        ArrayList<Integer> list
        int [] reverse;
        for(int i=plain.length;i>0;i--){
            System.out.print(i+" ");
        }

        


    }
}
