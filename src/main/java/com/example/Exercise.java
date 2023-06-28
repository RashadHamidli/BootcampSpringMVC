package com.example;

import java.util.Scanner;

public class Exercise {
    private static final String[] ones = {
            "", "bir", "iki", "üç", "dörd", "beş", "altı", "yeddi", "səkkiz", "doqquz"
    };

    private static final String[] tens = {
            "", "", "iyirmi", "otuz", "qırx", "əlli", "altmış", "yetmiş", "səksən", "doxsan"
    };

    private static final String[] teens = {
            "on", "on bir", "on iki", "on üç", "on dörd", "on beş", "on altı", "on yeddi", "on səkkiz", "on doqquz"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String numberInWords = convertToWords(number);
        System.out.println(numberInWords);
    }

    public static String convertToWords(int number) {
        if (number == 0) {
            return "sıfır";
        }

        if (number < 0) {
            return "mənfi " + convertToWords(-number);
        }

        String words = "";

        if ((number / 100) > 0) {
            words += ones[number / 100] + " yüz ";
            number %= 100;
        }

        if ((number / 10) > 1) {
            words += tens[number / 10] + " ";
            number %= 10;
        } else if (number < 10) {
            words += ones[number];
            number = 0;
        } else {
            words += teens[number - 10];
            number = 0;
        }

        if (number > 0) {
            words += ones[number];
        }

        return words;
    }
}

