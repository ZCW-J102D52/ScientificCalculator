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
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Integer userInput = scanner.nextInt();
        return userInput;
    }

    public static Double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Double userInput = scanner.nextDouble();
        return userInput;

    }

    public static Double getChange() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("C - Change number"); //user has to press C in order to change number
        Double input1 = scanner.nextDouble(); // allows the user to enter a new number
        return input1;
    }

    public static Double Calculation (String operator, double x, double y) {
        Core core = new Core();
        Scientific scientific = new Scientific();


        switch (operator) {
            case "C":
                return core.ChangeNumber(x, y);
            case "-":
                return core.subtract(x, y);
            case "+":
                return core.sum(x, y);

            case "*":
                return core.multiply(x, y);

            case "/":
                return core.divide(x, y);

            case "exp":
            case "^":
                return core.exp(x, y);
            //case "+":
            //return core.sum(x,y);
            case "square":
                return core.square(x);
            case "squareroot":
                return core.squareRoot(x);

            case "sin":
                return scientific.sine(x);
            case "cosine":
                return scientific.cosine(x);


            case "log":
                return scientific.logValue(x, y);
            case "inverselog":
                return scientific.inverseLog(x);
            case "naturallog":
                return scientific.naturalLog(x);
            case "inversenaturallog":
                return scientific.inverseNatLog(x);


            default:
                System.out.println("Can not recognize operator. Try again!");
                return null;
        }
    }
}
