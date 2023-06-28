package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        sumOfInt();
    }

    public static void perimetrOfTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ucbucagin tereflerinin uzunluqlarini daxil edin");
        double length1 = scanner.nextDouble();
        double length2 = scanner.nextDouble();
        double length3 = scanner.nextDouble();
        double perimetr = (length1 + length2 + length3);
        System.out.println("ucbucagin perimetri: " + perimetr);
    }

    public static void areaAndPerimetrOfRegtangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("duzbucaqlinin enini daxil edin: ");
        double breadth = scanner.nextDouble();
        System.out.print("duzbucaqlinin uzunlugunu daxil edin: ");
        double length = scanner.nextDouble();
        double area = breadth * length;
        double perimetr = 2 * (breadth + length);
        System.out.println("duzbucalinin sahesi: " + area);
        System.out.println("duzbucaqlinin perimetri: " + perimetr);
        scanner.close();
    }

    public static void sumOfInt() {
        System.out.println("ededi daxil edin: ");
        Scanner scanner = new Scanner(System.in);
        int eded = scanner.nextInt();
        int result = 0;
        for (int i = eded; i != 0; i /= 10) {
            int a = i % 10;
            result += a;
        }
        System.out.println(result);
    }
    public static void checkUserNameAndPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("istifadeci adini daxil edin: ");
        String name = scanner.nextLine();
        System.out.print("istifadeci parolunu daxil edin: ");
        String password = scanner.nextLine();
        String userName = "admin";
        String userPassword = "admin";
        if (name.equals(userName) && password.equals(userPassword))
            System.out.println("sisteme daxil oldunuz");
        else
            System.out.println("istifadeci adi ve ya parol yanlisdir");
        scanner.close();
    }
}
