package com.company;

public class Fibonacci_Series {
    static int series(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return series(n - 1) + series(n - 2);
        }
    }

    public static void main(String[] args) {
        int N=10;
        for(int i =0;i<N;i++){
            System.out.print(series(i) + " ");
        }

    }

    }

