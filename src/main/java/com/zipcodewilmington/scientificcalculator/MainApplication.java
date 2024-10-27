package com.zipcodewilmington.scientificcalculator;

import com.google.inject.internal.util.Strings;

import javax.swing.*;
import java.util.Scanner;
import java.lang.Math;
/**
 * Created by leon on 2/9/18.
 */

//Enter a number from 1-4 according to the function you want the calculator to perform.
//After that choose numbers to add, subtract, multiply, divide and then press 5 to exit.  .

public class MainApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Lycaena Calculator");
            System.out.println("Select operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Degrees");
            System.out.println("6. Radians");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();
            if (choice == 7) {
                break;
            }
            System.out.println("Enter first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Enter second number:");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case 1:
//                    System.out.println("Enter second number:");
//                    double num2 = scanner.nextDouble();
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("Enter second number:");
//                    double num2 = scanner.nextDouble();

                    System.out.println("Result: " + subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Enter second number:");
//                    double num2 = scanner.nextDouble();

                    System.out.println("Result: " + multiply(num1, num2));
                    break;
                case 4:
                    System.out.println("Enter second number:");
//                    double num2 = scanner.nextDouble();

                    System.out.println("Result: " + divide(num1, num2));
                    break;
                case 5:
                    double degrees = num1;
                    System.out.println(Math.toRadians(degrees));
                    break;

                case 6:
                    double radians = num1;
                    System.out.println(Math.toDegrees(radians));
                    break;

                case 7:
                    System.out.println("Invalid choice.");
                    break;
            }

            System.out.println();
        }
        scanner.close();

    }

    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;

    }
    public static double multiply(double a, double b) {
        return a * b;

    }
    public static double divide(double a, double b) {
        return a / b;
    }

    public static double degrees(double a, double b) {
        double degrees = 0;
        double radians;
        return degrees;
    }
    public static double radians(double a, double b) {
        double radians = 0;
        double degrees;
        return radians;

    }



    //Switch trig units mode(Degrees, Radians):
    {
        double radians = 0;
        double degrees = 0;
        degrees = radians * (degrees / Math.PI);
        radians = degrees * (Math.PI / 180);

        System.out.println(Math.toRadians(degrees));
        System.out.println(degrees + " degrees is " + radians + " radians.");
        System.out.println();

        System.out.println(Math.toDegrees(radians));
        System.out.println(radians + " radians is " + degrees + " degrees.");
        System.out.println();


//    public static class AngleConverter
//      public static degrees1();{
//      AngleConverter angleInDegrees = new AngleConverter(45, "degrees");
//      AngleConverter angleInRadians = new AngleConverter(Math.PI / 180, "radians");}
//
////    System.out.println("degrees to radians: " + angleInDegrees.toRadians());
////    System.out.println("Radians to degrees: " + angleInRadians.toDegrees());
//
//        public AngleConverter(double v, String radians) {
//        }
//
//        public static double toRadians(double degrees) {
//           return Math.toRadians(degrees);
//        }
//
//        public static <degrees> void toDegrees(double radians) {
////           return Math.toDegrees(radians);
//
//            double num1 = 90;
//            Double degrees1 = Console.getDoubleInput("Enter a double.");
//            double radians1 = Math.toRadians(degrees1);
//            System.out.println(degrees1 + " degrees is " + radians1 + " radians.");
//            System.out.println();
//
//            double radians2 = Math.PI / 2;
//            double degrees2 = Math.toDegrees(radians2);
//            System.out.println(radians2 + " radians is " + degrees2 + " degrees.");
//            System.out.println(num1);
//        }
//

//            Console.println("Welcome to my calculator!");
//            String s = Console.getStringInput("Enter a string");
//            Integer i = Console.getIntegerInput("Enter an integer");
//            Double d = Console.getDoubleInput("Enter a double.");
//
//            Console.println("The user input %s as a string", s);
//            Console.println("The user input %s as a integer", i);
//            Console.println("The user input %s as a d", d);


    }
}
