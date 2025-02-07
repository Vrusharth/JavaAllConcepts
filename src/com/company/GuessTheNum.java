package com.company;

import java.security.cert.TrustAnchor;
import java.util.Scanner;

class Game{
    private int counter=0;
    private int myGuess;
    private int compNumber;
    // constructor will be revoked first for target number
    public Game(){
        compNumber=(int)(Math.random()*100);
    }
    // setting user input
    public void setNumber(int n){
        myGuess=n;
    }
    // checking for match
    public int isCorrect(){
        if(myGuess==compNumber){
            return 0;
        } else if (myGuess>compNumber) {
            return -1;
        }
        else {
            return 1;
        }
    }
    // set the counter for score calculation
    public void setCounter(){
        counter++;
    }
    public void getCounter(){
        System.out.println("You guessed the number in "+ counter +" attempts");
    }

}

public class GuessTheNum{
    public static void main(String[] args) {
        System.out.println("Lets start the game ");
        System.out.println("Guess the number :");
        // generating a random number between 1-100
        Game obj=new Game();
        Scanner sc=new Scanner(System.in);


        while (true){
            int n=sc.nextInt();
            obj.setNumber(n);

            if(obj.isCorrect()==0){
                System.out.println("You guessed the right number");
                obj.setCounter();
                obj.getCounter();
                break;
            } else if (obj.isCorrect()==-1) {
                System.out.println("Enter a smaller number !!");
                obj.setCounter();
            }
            else if (obj.isCorrect()==1) {
                System.out.println("Enter a Bigger number !!");
                obj.setCounter();
            }
        }
    }
}