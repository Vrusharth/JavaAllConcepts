package com.company;

import java.util.Arrays;

public class ArraysConcept {
    public static void main(String[] args) {

        //Methods of creating arrays
        //Method 1:  Declaration, Allocation at once
        //    int [] Marks = new int[100];



        //Method 2: First Declaration followed by Allocation
//          int [] Marks; ---->D eclaration
//        Marks= new int[100];---> Memory Allocation
        int [] Marks;
        Marks= new int[100];
        Marks[0]=123;
        Marks[1]=122;
        Marks[2]=124;
        Marks[3]=122;
        System.out.println(Marks[2]);

//Method 3: Declaration memory allocation and initialization all at once
        int [] studentMarks={22,34,55,65,54,67,89,98,76,76,54,45};
        System.out.println(Arrays.toString(studentMarks));

//        Array operations
//        Array Length
//        System.out.println(studentMarks.length);
//        String [] namesxy = new String[10];
//        namesxy[0] = "bhdcvh";
//        System.out.println(namesxy[0]);

//        for(int i=0; i<= studentMarks.length; i++){
//            System.out.println(studentMarks[i]);
//        }

//        Using for each loop
        System.out.println("Printing using for each loop");
        for(int element: studentMarks){
            System.out.println(element);
        }







    }
}
