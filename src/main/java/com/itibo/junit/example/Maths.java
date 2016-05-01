package com.itibo.junit.example;

/**
 * Created by vlad on 28.04.16.
 */
public class Maths {

    public int sum(int a, int b){
        return a+b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public int residue(int a, int b){
        return Math.abs(a-b);
    }

    public int factorial(int number){
        if (number < 0)
            throw new IllegalArgumentException();

        int result = 1;

        if (number > 1) {
            for (int i = 1; i <= number; i++) {
                result = result * i;
            }
        }
        return result;
    }
}
