package com.company;

class MyEmployee{
    private int id;
    private String name;

//    Getters use return
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

//    Setters use void

    public void setName(String n){
        name=n;
    }


    public void setId(int i){
        id=i;
    }
}
public class Access_Modifiers {
    public static void main(String[] args) {
        // creating object
        MyEmployee Arav=new MyEmployee();

        //using getters and setters

        //setter
        Arav.setId(12);
        Arav.setName("Mehta");
        //getter
        System.out.println("My name is Arav "+Arav.getName());
        System.out.println("My id is "+Arav.getId());
    }
}
