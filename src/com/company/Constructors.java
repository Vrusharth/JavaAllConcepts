package com.company;

class MyMainEmployee{
    private int id;
    private String name;
    // Constructor is a method with name exactly same as parent class

//    public MyMainEmployee(){
//        id=21;
//        name="Enter your name";
//    }

    // passing arguments in a constructor
    // Constructors support Method overloading just like methods
    public MyMainEmployee(String myName,int myId){
        id=myId;
        name=myName;
    }

    public String getName(){ return name; }
    public int getId(){ return id; }
    public void setName(String n){ this.name=n;}
    public void setId(int n){ this.id=n;}


}
public class Constructors {
    public static void main(String[] args) {
        MyMainEmployee Vrusharth=new MyMainEmployee("Nirmal_Patil",26);

//        Vrusharth.setId(26);
//        Vrusharth.setName("Nirmal");

        // invokes the constructor without setting the parameters
        System.out.println(Vrusharth.getName());
        System.out.println(Vrusharth.getId());



    }
}
