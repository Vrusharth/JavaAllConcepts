package com.company;

// Creating an interface : has abstract methods
interface Bicycle{
    int a=65; //can't be tampered
    void applyBrakes(int decrement);
    void speedUp(int increment);
}
// creating one more interface
interface Wheel{
    void diameter(int inches);
    void spokes(int spokes_num);
}


class Hero implements  Bicycle{
    @Override
    public void applyBrakes(int reduce ){
        System.out.println("Reduce the speed");
    }
    @Override
    public void speedUp(int increment){
        System.out.println("Increase your speed !");
    }
    void blowhorn(){
        System.out.println("Horn");
    }
    public Hero(){
        System.out.println("Hello");
    }
}

// a class can implement more than one interfaces too

class twoInterfaceClass implements Bicycle,Wheel{
    @Override
    public void applyBrakes(int decrement) {
        System.out.println("I am inside Interface 1");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("I am inside Interface 1");
    }

    @Override
    public void diameter(int inches) {
        System.out.println("I am inside Interface 2");
    }

    @Override
    public void spokes(int spokes_num) {
        System.out.println("I am inside Interface 2");
    }
}

public class AbstractvsInterfaces {
    public static void main(String[] args) {
        Hero hero=new Hero();
        hero.applyBrakes(65);
       // hero.a=98;//Cannot assign a value to final variable 'a'
        System.out.println(hero.a);
        twoInterfaceClass obj=new twoInterfaceClass();
        obj.applyBrakes(43);
        obj.speedUp(65);
        obj.diameter(10);
        obj.spokes(5);

    }
}
