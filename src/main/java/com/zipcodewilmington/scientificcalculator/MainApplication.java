package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Integer i2 = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);

        int answer = i / i2;


        try {

        } catch (ArithmeticException e) {
            System.out.println("You are not allowed to divide by zero.");
        } catch (Exception e) {
            System.out.println("Error: Please try again");
        } finally {
            System.out.println("Please continue");
        }

    }
    double memoryValue = 0.0;;
    public void setMPlus(double value) {
        memoryValue += value;
    }
    public double getMRC() {
        return memoryValue;
    }
    public void getMC() {
        memoryValue = 0.0;
    }
    }


