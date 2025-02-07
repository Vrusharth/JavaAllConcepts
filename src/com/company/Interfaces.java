package com.company;

interface Animal {
    void makeSound();// Abstract method
}

class Dog implements Animal{
    @Override
    public void makeSound(){
        System.out.println("Bark! Bark!");
    }
}
public class Interfaces  {
    public static void main(String[] args) {

    }
}
