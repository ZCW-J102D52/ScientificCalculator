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
                System.out.print("5. Invertsign \t6.Factorial \t7.Log \t8.Anti Log10");
                System.out.print("\t9. Anti Log");
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
                        System.out.println("Square of the given number is : ");
                        System.out.printf("%.2f", square);
                        break;
                    }
                    case 3: {
                        //Square root
                        double root = squareRoot(acceptDoubleNum());

                        System.out.println("SquareRoot of the given number is : ");
                        System.out.printf("%.2f", root);
                        break;
                    }
                    case 4: {
//                      //Exponentiation
                        double exponentiation = exponentiation(acceptDoubleNum());
                        System.out.println("exponentiation of the given number is : ");
                        System.out.printf("%.2f", exponentiation);
                        break;
                    }

                    case 5: {
                        //Inverse the number
                        InverseFunction inverse = new InverseFunction();
                        inverse.calculateInvertSign();
                        break;

                    }

                    case 6: {
                        long fact = factorial(acceptIntNum());
                        System.out.println("Factorial of the given number is : " + fact);
                        break;
                    }

                    case 7: {
                        double logValue = logFunction(acceptDoubleNum());
                        System.out.println("Logarithm of the given number is : ");
                        System.out.printf("%.2f", logValue);
                        break;
                    }

                    case 8: {
                        double log10Value = logFunction10(acceptDoubleNum());
                        System.out.println("Logarithm of the given number is : ");
                        System.out.printf("%.2f", log10Value);
                        break;

                    }

                    case 9 : {
                        double antiLog = antiLog(acceptDoubleNum());
                        System.out.println("Inverse Logarithm of the given number is : ");
                        System.out.printf("%.2f", antiLog);
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
            public static long factorial(long n1) {
                long result = 1L;
                for (long i = 1; i <= n1; i++) {
                    result *= i;
                }
                return result;

            }


//method for natural logarithm function
    public static double logFunction(double n1){

        double logvalue = Math.log(n1);
        return logvalue;

    }
//method for inverse of logarithm function
    public static double logFunction10(double n2) {
        double log10result = Math.log10(n2);
        return log10result;
    }
//method for inverse of natural logarithm function
    public static double antiLog(double n1){
        double y = Math.log(n1); // Calculate the natural log of x
        double inverselog = Math.exp(y);
//        double y = Math.log(n1) / Math.log(base); // Calculate log base 'base' of x
//        double inverselog = Math.pow(base, y);
        return inverselog;

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



