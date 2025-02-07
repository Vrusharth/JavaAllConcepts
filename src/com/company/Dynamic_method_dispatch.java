package com.company;

class Phone{

    public void greet(){
        System.out.println("Welcome !!");
    }
    public void name(){
                System.out.println("Nokia 411");
    }
}
class Smartphone extends Phone{
    @Override
    public void name(){
        System.out.println("Samsung Galaxy note 12");
    }

    public void swagat(){
        System.out.println("Apla swagat ahe !!");
    }
}

public class Dynamic_method_dispatch {
    public static void main(String[] args) {

        // Runtime polymorphism
        Phone obj=new Smartphone(); // obj1 is reference of superclass Phone and object of subclass Smartphone
        obj.name();   // will execute the methods of Superclass
        obj.greet();  // will execute the methods of Superclass
    }
}
