package com.company;

class Phone1{

    public void greet(){
        System.out.println("Welcome !!");
    }
    public void name(){
        System.out.println("Nokia 411");
    }
}
class Smartphone1 extends Phone1{

    public void name1(){
        System.out.println("Samsung Galaxy note 12");
    }

    public void swagat(){
        System.out.println("Apla swagat ahe !!");
    }
}

public class dispatch {
    public static void main(String[] args) {

        // Runtime polymorphism
        Phone1 obj=new Smartphone1(); // obj1 is reference of superclass Phone and object of subclass Smartphone
        obj.name();   // will execute the methods of Superclass
        obj.greet();  // will execute the methods of Superclass

    }
}

