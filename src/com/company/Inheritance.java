package com.company;

class Base{
    int x;

    public void setX(int x) {
        System.out.println("I am in Base and setting x now ");
        this.x = x;
    }

    public int getX() {
        return x;
    }
    public void printMe(){
        System.out.println("I am constructor");
    }
}

// Derived is child of Base using extends
class Derived extends Base{
    int Y;

    public int getY() {
        return Y;
    }
    public void setY(int y){
        Y=y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Base B =new Base();
        B.setX(23);
        System.out.println(B.getX());

//     methods are available in derived class
        Derived D=new Derived();
        D.setX(43);
        System.out.println(D.getX());
    }
}
