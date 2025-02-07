package com.company;

import java.lang.Math;
class Circle{
    public int radius;
    public Circle(int r){
        System.out.println("I am circle parameterized constructor");
        radius=r;
    }

    public double area(){
         return Math.PI*this.radius*this.radius;
    }

}
class Cylinder extends Circle{
    public int height;

    public Cylinder(int r,int h) {
        super(r);
        System.out.println("I am cylinder parameterized constructor");
        this.height=h;
    }

    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class Inheritance_Practice {
    public static void main(String[] args) {
        Circle obj1=new Circle(12);
        System.out.println(obj1.area());;

    }
}










