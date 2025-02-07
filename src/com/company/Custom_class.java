package com.company;

class Employee{
    int id;
    String name;
    int salary;
// methods
    public void printDetails() {
        System.out.println("The name is "+name);
        System.out.println("The id is "+id);

    }

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name =n;
    }
}

class phone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Friend...");
    }
}

public class Custom_class {
    public static void main(String[] args) {
        System.out.println("This is the custom class");
       /*
        // For class Employee
        //Instantiating new employee Object
        Employee Aditya=new Employee();
        Employee Harshal=new Employee();
        Employee abhi=new Employee();


        // Setting the attributes for object Aditya
        Aditya.id=99;
        Aditya.name="CodingNinja";
        Aditya.salary=30000;

        // Setting the attributes for object Harshal
        Harshal.id=100;
        Harshal.name="CodingWorrier";
        Harshal.salary=20000;

        // Setting the attributes for object abhi
        abhi.id=101;
        abhi.name="Abhijeet";
        abhi.salary=25000;

        // printing the attributes
//        System.out.println(Aditya.id);
//        System.out.println(Aditya.name);
        Aditya.printDetails();
        System.out.println(Aditya.getSalary());
        System.out.println(Aditya.getName());
        Aditya.setName("Biradar");// won't print this as its declared but not called or printed using sout
        System.out.println();

        Harshal.printDetails();
        System.out.println(Harshal.getSalary());
        Harshal.setName("Bhamare");
        System.out.println(Harshal.getName());
        System.out.println();

        System.out.println(abhi.getName());
        System.out.println(abhi.getSalary());
        abhi.setName("Jeet");
        System.out.println(abhi.getName());
        System.out.println();


//  For the class phone
        phone oppo=new phone();
        oppo.callFriend();
        oppo.ring();
        oppo.vibrate();

        */

    }
}
