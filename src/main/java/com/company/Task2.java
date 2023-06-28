package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        gradeSystem();
    }

    public static void greatestNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1ci ədədi daxil edin: ");
        int number1 = scanner.nextInt();

        System.out.print("2ci ədədi daxil edin: ");
        int number2 = scanner.nextInt();

        System.out.print("3cü ədədi daxil edin: ");
        int number3 = scanner.nextInt();

        int greatestNumber = number1;

        if (number2 > greatestNumber)
            greatestNumber = number2;

        if (number3 > greatestNumber)
            greatestNumber = number3;

        System.out.println("En böyük ədəd: " + greatestNumber);

        scanner.close();
    }

    public static void rectangleSquareChecker() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Düzbucaqlının uzunluğunu daxil edin: ");
        int length = scanner.nextInt();

        System.out.print("Düzbucaqlının enini daxil edin: ");
        int breadth = scanner.nextInt();

        if (length == breadth)
            System.out.println("Bu kvadratdır.");
        else
            System.out.println("Bu kvadrat deyil.");

        scanner.close();
    }

    public static void greatestNumberTo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1ci ədədi daxil edin: ");
        int number1 = scanner.nextInt();

        System.out.print("2ci ədədi daxil edin: ");
        int number2 = scanner.nextInt();

        int greatestNumber = number1;
        if (number2 > greatestNumber)
            greatestNumber = number2;

        System.out.println("Ən böyük ədəd: " + greatestNumber);
        scanner.close();
    }

    public static void gradeSystem() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks: ");
        int marks = scanner.nextInt();

        String grade;

        if (marks < 50)
            grade = "F";
        else if (marks <= 60)
            grade = "E";
        else if (marks <= 70)
            grade = "D";
        else if (marks <= 80)
            grade = "C";
        else if (marks <= 90)
            grade = "B";
        else
            grade = "A";

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}