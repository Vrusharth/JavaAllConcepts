package com.company;

public class Method_Overloading {
    static  void tell_joke(){
        System.out.println("I Invented a new word");
    }
    static int change(int a){
        a = 98;
        return a;
    }
    static void change(int [] arr){
        arr[0]=98;
    }
    public static void main(String[] args) {
//  Case 1:Changing the array using method
        int [] marks={52,54,56,75};
        change(marks);
        System.out.println("The changed value is: "+ marks[0]);
//  Case 2:Changing an integer
        int x = 45;
        x=change(x);
        System.out.println("The changed value is: " + x);
    }

//    Arguments : They are actual values
//    Parameters : values method can take
}
