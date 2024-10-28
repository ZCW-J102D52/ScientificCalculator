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
        System.out.println("Change number"); //user has to press C in order to change number
        Double input1 = scanner.nextDouble(); // allows the user to enter a new number
        return input1;
    }

    public static Double Calculation (String operator, double x, double y) {
        Core core = new Core();
        Scientific scientific = new Scientific();


        switch (operator) {

            case "-":
            case "subtract":
            case "minus":
                return core.subtract(x, y);
            case "+":
            case "add":
                return core.sum(x, y);
            case "*":
            case "multiply":
                return core.multiply(x, y);
            case "divide":
            case "/":
                return core.divide(x, y);
            case "exp":
            case "^":
                return core.exp(x, y);
            case "square":
            case "sqr":
                return core.square(x);
            case "squareroot":
            case "sqrt":
                return core.squareRoot(x);
            case "C":
                return core.ChangeNumber(x, y);
            case "sin":
                return scientific.sine(x);
            case "cosine":
                return scientific.cosine(x);
            case "tan":
                return scientific.tangent(x);
            case "inverse sin":
            case "inverse sine":
                return scientific.inverseSine(x);
            case "inverse cosine":
            case "inverse cos":
                return scientific.inverseCosine(x);
            case "inverse tan":
            case "inverse tangent":
                return scientific.inverseTangent(x);
            case "log":
                return scientific.logValue(x, y);
            case "inverselog":
                return scientific.inverseLog(x);
            case "naturallog":
                return scientific.naturalLog(x);
            case "inversenaturallog":
                return scientific.inverseNatLog(x);
            case "factorial":
            case "!":
                return scientific.factorial(x);

            default:
                System.out.println("Can not recognize operator. Try again!");
                return null;
        }
    }
}
