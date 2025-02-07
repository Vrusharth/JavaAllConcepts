package com.company;

public class Loop_practice {
    public static void main(String[] args){
//        Example 1
//        int n = 4;
//       for(int i=n; i>0;i--){
//           for(int j =0;j<i;j++){
//               System.out.print("*");
//           }
//           System.out.print("\n");
//       }

//       Example 2
//        int sum =0;
//        int n =3;
//        for(int i=0;i<n;i++){
//            sum=sum+(2*i);
//
//        }
//        System.out.println("The sum of first 3 even numbers is "+sum);
//Example 3
//        int n=3;
//        for(int i =1;i<11;i++){
//            int mul=n*i;
//            String table=String.format("%d * %d = %d",n,i,mul);
//            System.out.println(table);
//        }
//        Example 4
        int n=4;
        int mul=1;
        for(int i =n; i>0; i--){
            mul=mul*i;
        }
        System.out.println("The factorial of 4 is "+mul);









    }
}
