package com.example.solvequadraticequation;

import java.util.Scanner;

public class SolveQuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a");
        double a = Double.parseDouble(input.nextLine());
        System.out.println("Enter b");
        double b = Double.parseDouble(input.nextLine());
        System.out.println("Enter c");
        double c = Double.parseDouble(input.nextLine());
        solveQuadraticEquation(a, b, c);
    }
    public static void solveQuadraticEquation(double a, double b, double c) {
        double x1, x2, delta;
        delta = (Math.pow(b, 2) - 4 * a * c);
        System.out.println();
        System.out.println("Delta = " + delta);
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep:  x1 = x2 = " + x1);
        } else {
            x1 = ((-b + Math.sqrt(delta)) / 2 * a);
            x2 = ((-b - Math.sqrt(delta)) / 2 * a);
            System.out.println("Phuong trinh co 2 nghiem phan biet: x1 = " + x1 + " va x2 = " + x2);
        }
    }
}
