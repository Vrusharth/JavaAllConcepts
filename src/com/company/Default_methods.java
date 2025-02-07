package com.company;

interface myCamera{
    void takeSnap();
    void recordVideo();
    default void basic(){
        System.out.println("Hello I am a default method in interface!");
    }
}

interface myWifi{
    String [] getnetworks();
    void connectoNetwork(String network);
}

class Mycellphone{
    void Callnumber(long  phoneNumber){
        System.out.println("Calling a number"+phoneNumber);
    }
    void receiveCall(int phoneNumber){
        System.out.println("Connecting..."+phoneNumber);
    }
}

class MysmartPhone extends Mycellphone implements myWifi,myCamera{
    @Override
    public void takeSnap(){
        System.out.println("Opening camera");
    }
    @Override
    public void recordVideo(){
        System.out.println("Hellooo");
    }

    @Override
    public String[] getnetworks() {
        return new String[0];
    }

    @Override
    public void connectoNetwork(String network) {
        System.out.println("connecting..."+network);
    }
}

public class Default_methods {
    public static void main(String[] args) {
        MysmartPhone obj=new MysmartPhone();
        // Interface myCamera
        obj.takeSnap();
        obj.recordVideo();
        //Interface myWifi
        obj.connectoNetwork("45675");
        obj.getnetworks();
        // Parent class myCellPhon


    }
}
