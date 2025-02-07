package com.company;

class Base1 {
    public int X;


    //Constructor
    public Base1(){
        System.out.println("I am the constructor in superclass");
    }
    // constructor overloading
    public Base1(int a){
            System.out.println("I am a overloaded constructor with value as "+a);
        }
    public void set(int x) {
        this.X = x;
    }
    public int getX() {
        return X;
    }
}

class Derived1 extends Base1{
    //constructor


    public Derived1(){
        // if we dont want to hop to by default constructor we can use super
        super(4);
         System.out.println("I am the Derived1 class constructor");
     }

}
class Derived2 extends Derived1{
    public Derived2(){
        super();
        System.out.println("I am inheriting properties of Base and Derived 1");
    }
}

public class Constructors_in_Inheritance {
    public static void main(String[] args) {
//        Base1 obj=new Base1();
        // here it will first find constructor in base class followed by its own constructor
        Derived1 D1=new Derived1();
        Derived2 D2=new Derived2();

    }
}
