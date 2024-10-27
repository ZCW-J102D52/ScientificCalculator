package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");
//
//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
//        Console.println("The user input %s as a d", d);


                Scanner scan = new Scanner(System.in);
                System.out.print("Choose the option: \n");
                System.out.print("1. InverseNumber \t2.Square \t3.Squareroot \t4.Exponent\t");
                System.out.print("5. Invertsign \t6.Factorial");
                int operator = scan.nextInt();


                switch (operator) {
                    case 1: {
                        //Inverse the number
                        InverseFunction inverse = new InverseFunction();
                        inverse.calculateInverse();
                        break;

                    }
                    case 2: {
//                      //square
                        double square = square(acceptDoubleNum());
                        System.out.println("Square of the given number is : " + square);
                        break;
                    }
                    case 3: {
                        //Square root
                        double root = squareRoot(acceptDoubleNum());

                        System.out.println("SquareRoot of the given number is : " + root);
                        break;
                    }
                    case 4: {
//                      //Exponentiation
                        double exponentiation = exponentiation(acceptDoubleNum());
                        System.out.println("exponentiation of the given number is : " + exponentiation);
                        break;
                    }

                    case 5: {
                        //Inverse the number
                        InverseFunction inverse = new InverseFunction();
                        inverse.calculateInvertSign();
                        break;

                    }

                    case 6: {
                        int fact = factorial(acceptIntNum());
                        System.out.println("exponentiation of the given number is : " + fact);
                        break;
                    }
                    default:
                        System.out.println("entered invalid number");
                }

                scan.close();
            }


            //Method to Calculate SquareRoot of a number
            public static double squareRoot(double x1) {
                double result = Math.sqrt(x1);
                return result;

            }

            //Method to Calculate square of a number
            public static double square(double x2) {
                double square = Math.pow(x2, 2);
                return square;
            }

            //Method to Calculate exponent of e^x
            public static double exponentiation(double x3) {
                double exponent = Math.exp(x3);
                return exponent;
            }

            //Method to Calculate FactoriaL of a number
            public static int factorial(int n1) {
                int result = 1;
                for (int i = 1; i <= n1; i++) {
                    result *= i;
                }
                return result;

            }


            // Methods to accept double input value
            public static double acceptDoubleNum() {
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter any number: ");
                double x = scan.nextInt();
                scan.close();
                return x;
            }
            // Methods to accept int input value
            public static int acceptIntNum() {
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter any number: ");
                int x = scan.nextInt();
                scan.close();
                return x;
            }
        }



