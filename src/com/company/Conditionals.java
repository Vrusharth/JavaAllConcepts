package com.company;
import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your Age : \n");
//        int age = sc.nextInt();
//        if(age >18){
//            System.out.println("Yes you can drive. ");
//        }
//        else {
//            System.out.println("You can't Drive yet.");
//        }
//        switch(age){
//            case 12:
//                System.out.println("You are a Teenager");
//                break;
//            case 18:
//                System.out.println("You are now eligible to vote");
//
//            case 60:
//                System.out.println(("Senior Citizen"));
//                break;
//            default:
//                System.out.println("Enter valid age!!");
//
//        }
//        Another method or Syntax no need to add break
//        String var ="Shivam";
//        switch (var){
//           case "Shivamshri" -> System.out.println("True");
//           case "Vrusharth", "Rohit" -> System.out.println("False");
//           case "Shivam" -> System.out.println(" NOt False");
//
//            default -> System.out.println("terminate");
//        }
//
//        System.out.println("Hello Student , Enter your percentage please\n");
//
//        System.out.println("Subject 1: ");
//        float sub1=sc.nextFloat();
//
//        System.out.println("Subject 2: ");
//        float sub2=sc.nextFloat();
//
//        System.out.println("Subject 3: ");
//        float sub3=sc.nextFloat();
//
//        float avg = (sub1+sub2+sub3)/3.0f;
//        System.out.println("Your total Average is :"+avg);
//
//        if(sub1>=33 && sub2>=33 && sub3>=33 && avg>40){
//            System.out.println("Pass");
//        }else {
//            System.out.println("Failed");
//        }

//    income tax problem
//        System.out.println("Please enter your income per anum");
//        float income;
//        income=sc.nextFloat();
//        if(income>250000 && income<500000){
//            System.out.println("Tax Rate : 5%");
//        } else if (income>500000 && income<1000000) {
//            System.out.println("tax Rate : 20%");
//        }
//        else if (income>1000000) {
//            System.out.println("Tax Rate: 30%");
//        }else{
//            System.out.println("No Tax :)");
//        }

        float tax=0;
        float Income;
        System.out.println("Enter your Annual income in lakhs");
        Income=sc.nextFloat();
        if(Income<2.5){
            tax=tax+0;
            System.out.println("No Tax");
        } 
        else if (Income>2.5f && Income<5.0f){
            tax = tax+0.05f*(Income-2.5f);
            System.out.println("your Tax is : "+tax);
        } else if (Income>=5.0f && Income<10.0f) {
            tax = tax+0.05f*(5.0f-2.5f);
            tax = tax+0.2f*(Income-5.0f);
            System.out.println("your Tax is : "+tax);
        }
        else if (Income>=10.0f) {
            tax = tax+0.05f*(5.0f-2.5f);
            tax = tax+0.2f*(10.0f-5.0f);
            tax = tax+0.3f*(Income-10.0f);
            System.out.println("your Tax is : "+tax);

        }
        int a=10;
        while(a==10){
            System.out.println(a);
        }


    }
}

