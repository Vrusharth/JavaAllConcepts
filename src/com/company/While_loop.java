package com.company;

public class While_loop {
    public static void main(String[] args) {
        int a = 1;
        while (a <= 3) {
            System.out.println(a);
            a++;
        }

        do{
            a=a+10;
            System.out.println(a);
        }while(a<=15);
        int x=0;
        while(x<100){
            if(x%2!=0){
                System.out.printf("%d is a odd number\n",x);
            }else{
                System.out.printf("%d is not a odd number\n",x);
            }
            x++;
        }
    }
}
