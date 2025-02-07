package com.company;

abstract class Greet{
    public Greet(){
        System.out.println("I am the constructor of Greet");
    }
    public void named(String name){
        System.out.println(name);
    }
    abstract public void greet();
}

class greetchild extends Greet{
    @Override
    public void greet(){
        System.out.println("Hello");
    }
}
class greetchildtwo extends Greet{
    public void greet(){
        System.out.println("Hello");
    }
}

public class Abstract_Method_Class {
    public static void main(String[] args) {
        greetchild obj1=new greetchild();
        obj1.greet();
        obj1.named("Vrusharth");
        greetchildtwo obj2=new greetchildtwo();
        obj2.greet();

    }
}
