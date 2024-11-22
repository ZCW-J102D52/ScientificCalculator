package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

    public class InverseFunction {


        public static double calculateInverse(double y) {


            System.out.println("Original Input value : " + y);
            System.out.println("Inverse of input value: ");
            System.out.printf("%.2f %n", inverseNumF(y));
            return inverseNumF(y);

        }

        //Function to inverse the number
        public static double inverseNumF(double y) {
            return 1/y;
        }

        //Function to invert the sign of the number
        public  static double calculateInvertSign(double a) {

            int number = Math.negateExact((int) a);
            System.out.print("Inverted value of number is: " + number);
            return (double)(number);
        }

 }
