package com.company;

class MyThread extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("My Thread is running");
            System.out.println("I am Happy");
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("My Thread is2");
            System.out.println("I am SSad");
        }
    }
}

public class multiThreadingJava {
    public static void main(String[] args) {
        MyThread T1= new MyThread();
        MyThread2 T2=new MyThread2();

        T1.start();
        T2.start();
    }
}
