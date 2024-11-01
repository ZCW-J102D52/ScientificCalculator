package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

        public static String getStringInput(String prompt) {
            Scanner scanner = new Scanner(System.in);
            println(prompt);
           String operator = scanner.nextLine().toLowerCase();
           return operator;
    }

    public static Double getFirstDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        return scanner.nextDouble();
    }

    public static Double getSecondDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Double num2 = scanner.nextDouble();
        return num2;
    }

    public static void clearTheScreen() {
        for (int i=0;i<=20;i++){
        System.out.println(" ");}
    }

    public static void getBunny() {
        System.out.println(" /)_/)");
        System.out.println("( o.o )");
        System.out.println(" > ^ <");
    }







}
