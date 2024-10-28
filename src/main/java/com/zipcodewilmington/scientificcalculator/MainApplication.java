package com.zipcodewilmington.scientificcalculator;
import com.zipcodewilmington.scientificcalculator.Scientific;

import java.lang.Math;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        // codes for colors
        String reset = "\u001B[0m";
        String yellow = "\u001B[33m";
        String cyan = "\u001B[36m";
        String purple = "\u001B[35m";

        // welcome message
        System.out.println(cyan + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + reset);
        System.out.println(cyan + "|" + reset + yellow + "   Welcome to Xylophanes Calculator!    "  + reset + cyan +
                "|" + reset);
        System.out.println(cyan + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + reset);
        System.out.println();


        //Console.println("Welcome to my calculator!");
        /*String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);*/

        int firstInt = Console.getIntegerInput("Enter a number below:");
        String operator = Console.getStringInput("Enter operator:");
        int secondInt = Console.getIntegerInput("Enter next number:");
        //Double ChangeNumber = Console.getChange();

        System.out.println( "\nThe result of your calculation is: " + Console.Calculation(operator, firstInt, secondInt )+ "\n");

        System.out.println(yellow + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + reset);
        System.out.println(yellow + "|" + reset + purple + "   Numbers crunched, answers found. Thanks for using our calculator!    "  + reset + yellow +
                "|" + reset);
        System.out.println(yellow + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + yellow);
        System.out.println();


    }


}