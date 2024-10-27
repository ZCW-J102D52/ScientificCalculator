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

    public static Integer getFirstIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Integer num1 = scanner.nextInt();
        return num1;
    }

    public static Integer getSecondIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Integer num2 = scanner.nextInt();
        return num2;
    }

    public static Double getFirstDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Double num1 = scanner.nextDouble();
        return num1;
    }

    public static Double getSecondDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Double num2 = scanner.nextDouble();
        return num2;
    }

    public static void clearTheScreen() {
        System.out.print("\033\143");
    }

    public static void getBunny() {
        System.out.println(" /)_/)");
        System.out.println("( o.o )");
        System.out.println(" > ^ <");
    }

    public static String sendToMem(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String wantMem = scanner.nextLine().toLowerCase();
        return wantMem;
    }

    public static String toQuit(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String toQuit = scanner.nextLine().toLowerCase();
        println("toquit value: "+toQuit);
        return toQuit;
    }

// I am trying something new. let's see if this vanishes.








}
