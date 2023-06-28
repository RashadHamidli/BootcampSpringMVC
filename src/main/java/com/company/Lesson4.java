package com.company;

public class Lesson4 {
    public static void main(String[] args) {

    }

    public static void findSimpleNumber() {
        for (int i = 2; i <= 100; i++) {
            boolean b = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                System.out.print(i + " ");
            }
        }
    }
}
