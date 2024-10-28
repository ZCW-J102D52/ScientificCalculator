package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        /*String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);*/

        Double firstInt = Console.getDoubleInput("Enter command");
        String operator = Console.getStringInput("Enter operator");
        Double secondInt = Console.getDoubleInput("Enter next command");
        //Double ChangeNumber = Console.getChange();

        System.out.println( firstInt + operator + secondInt +  "=" + Console.Calculation(operator, firstInt, secondInt));


    }


}