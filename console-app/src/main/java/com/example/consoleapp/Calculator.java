package com.example.consoleapp;

import java.security.NoSuchAlgorithmException;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("sum of two numbers: " + Calculator.sum(5, 9));
        System.out.println("difference of two numbers: " + Calculator.sub(5, 9));
        System.out.println("product of two numbers: " + Calculator.mul(5, 9));
        try {
            System.out.println("quotient of two numbers: " + Calculator.divide(10, 5));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) throws NoSuchAlgorithmException {
        if (b == 0) {
            throw new NoSuchAlgorithmException();
        }
        return a / b;
    }
}
