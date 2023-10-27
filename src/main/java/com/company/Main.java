package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       louncher();
     }



    public static void louncher(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("gerginliyi daxil edin:");
        int i;
        while (true) {
            i = scanner.nextInt();
            if (i > 190) {
                if (i < 240) {
                    System.out.println(birinciXett());
                    louncher();
                } else {
                    if (i > 240) {
                        System.out.println(gerginlikCoxdur());
                    } else {
                        System.out.println( gerginlikAzdir());
                    }
                }
            }
            System.out.println("ikinci xettdeki gerginliyi daxil edin");
            i = scanner.nextInt();
            if (i > 190) {
                if (i < 240) {
                    System.out.println( ikinciXett());
                    louncher();
                } else {
                    if (i > 240) {
                        System.out.println(gerginlikCoxdur());
                    } else {
                        System.out.println(gerginlikAzdir());
                    }
                }
            }else {
                System.out.println("generator qosuldu");
                louncher();
            }
        }
    }
    public static String gerginlikCoxdur(){
       return "gerinlik coxdur";
    }
    public static String gerginlikAzdir(){
       return "gerinlik azdir";
    }
    public static String birinciXett(){
       return "birinci xett qosulub";
    }
    public static String ikinciXett(){
       return "ikinci xett qosulub";
    }
}
