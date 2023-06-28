package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        drawRegtangleByScannerAndForLoop();
    }

    public static void printAllNumberBetweenOneAndTen() {
        int number = 10;
        for (int i = 0; i < number; i++)
            System.out.println(i + 1);
    }

    public static void sumFirstTenNaturalNumber() {
        int result = 0;
        for (int i = 0; i < 10; i++)
            result += i;
        System.out.println(result);
    }

    public static void sumAllNumbersBetweenTwoNaturalNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("enter second number: ");
        int secondNumber = scanner.nextInt();
        int result = 0;
        for (int i = firstNumber; i <= secondNumber; i++)
            result += i;
        System.out.println(result);
    }

    public static void drawRegtangleByForLoop() {
        int number = 4;
        for (int i = 0; i < number; i++) {
            System.out.println("**********");
        }
    }

    public static void drawRegtangleByScannerAndForLoop() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter regtangle width: ");
        int width = scanner.nextInt();
        System.out.print("enter regtangle length: ");
        int length = scanner.nextInt();
        for (int i = 0; i < width; i++) {
            for (int j = 1; j < length; j++) {
                System.out.print("* ");
            }
            System.out.println("*");
        }
    }

    public static void drawTriangleByForLoop() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
