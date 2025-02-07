package com.company;


class square{
    float side;
    // Method to find area
    public float area(){
        return side*side;
    }
    // method to cal. perimeter
    public float perimeter(){
        return 4*side;
    }
}

public class Oop_Classes {

    public static void main(String[] args) {

        square sq1=new square();
        sq1.side=10f;
        System.out.println(sq1.area());
        System.out.println(sq1.perimeter());
    }
}
