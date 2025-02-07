package com.company;

class A{
    public int a;
    public int abc(int n){
        return n;
    }

    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}

class B extends A{
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
    // @override is a annotation to show method is overriden.
    @Override
    public void meth2(){
        System.out.println("I am method 2 in class B");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        A a=new A();
        a.meth2();  // calls meth2 of Class "A"

        B b=new B();
        b.meth2(); // calls meth2 of Class "B"
    }
}
