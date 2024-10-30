package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
import com.google.inject.internal.util.Strings;
import javax.swing.*;
import java.util.Scanner;
import java.lang.Math;



    //Switch trig units mode(Degrees, Radians):
    /*{
        double radians = 0;
        double degrees = 0;
        degrees = radians * (degrees / Math.PI);
        radians = degrees * (Math.PI / 180);

        System.out.println(Math.toRadians(degrees));
        System.out.println(degrees + " degrees is " + radians + " radians.");
        System.out.println();

        System.out.println(Math.toDegrees(radians));
        System.out.println(radians + " radians is " + degrees + " degrees.");
        System.out.println(); */


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


public class MainApplication {
    public static void main(String[] args) {

        System.out.println("*********************************************");
        System.out.println("*                                           *");
        System.out.println("*  Welcome to the Lycaena Tech Calculator!  *");
        System.out.println("*                                           *");
        System.out.println("*********************************************");
        String toQuit = "n";
        Double num1 = Console.getFirstDoubleInput("*              Enter a Number               *");
        do {
            System.out.println("*********************************************");
            System.out.println("*  Type the name of the operation or symbol *");
            System.out.println("*        You can even summon a Bunny        *");
            System.out.println("* Enter 'oops' to enter a new first number  *");
            System.out.println("*********************************************");
            String operator = Console.getStringInput("*             Enter the Operation           *");
            while (operator.equals("oops")) {
                num1 = Console.getFirstDoubleInput("*             Enter a New Number             *");
                operator = Console.getStringInput("*             Enter the Operation           *");
            }

            switch (operator) {
                //Addition Sharmin
                case "+":
                case "add":
                case "addition":
                case "plus":
                 //   double num2 = Console.getSecondDoubleInput("Enter Second number:");
                    //System.out.println("Result: " + add(num1, num2));
                    //num1 += num2;
                    //return num1;
                    //public double add(double a, double b) {
                    //return a + b;

                      // }
                  break;
                //Subtraction Sharmin
                case "-":
                case "sub":
                case "subtraction":
                case "minus":
                    double num2 = Console.getSecondDoubleInput("Enter second number");
                    System.out.println("Result: " + Opera.subtract(num1, num2));
                    break;
               //Multiplication Sharmin
               case "x":
                case "times":
                case "multiply":
                case "multiplication":
                  double secondMulti = Console.getSecondDoubleInput("Enter second number");
                    System.out.println("Result: " + Opera.multiply(num1, secondMulti));
                    break;
                //Division Sharmin
                case "/":
                case "divide":
                case "division":
                    double divid2 = Console.getSecondDoubleInput("Enter second number");
                    System.out.println("Result: " + Opera.divide(num1, divid2));
                    break;
                // Divide by zero error Ron
                 try {

                  } catch (ArithmeticException e) {
                    System.out.println("You are not allowed to divide by zero.");
                  } catch (Exception e) {
                    System.out.println("Error: Please try again");
                  } finally {
                      System.out.println("Please continue");
                  }
                    break;
              //Radians to Degrees Sharmin  
                case "radians to degrees":
                case "rads to degs":
                case "r to d":
                    double degrees = num1;
                    System.out.println(Math.toRadians(degrees));
                    break;
              //Degrees to Radians Sharmin
                case "degrees to radians":
                case "degs to rads":
                case "d to r":
                    double radians = num1;
                    System.out.println(Math.toDegrees(radians));
                    break;
                //Inverse number Deepti
                case "inverse number":
                case "inverse num":
                      InverseFunction inverse = new InverseFunction();
                      inverse.calculateInverse();
                      break;
                //Invert sign Deepti
                case "invert sign":
                case "inv sign":
                      InverseFunction inverse1 = new InverseFunction();
                      inverse1.calculateInvertSign();
                      break;
                //Square Deepti
                case "square":
                case "sq":
                      double square = Opera.square(Opera.acceptDoubleNum());
                      System.out.println("Square of the given number is : ");
                      System.out.printf("%.2f", square);
                      break;
              //Square Root Deepti
                case "square root":
                case "sq rt":
                      double root = Opera.squareRoot(Opera.acceptDoubleNum());
                      System.out.println("SquareRoot of the given number is : ");
                      System.out.printf("%.2f", root);
                      break;
                //Exponential Deepti
                case "exponential":
                case "expo":
                case "exponent":

                    //Exponentiation
                    double [] input = Opera.acceptArrayInput();
                    double exponentiation = Opera.exponentiation(input[0],input[1]);
                    System.out.println("exponentiation of the given number is : " + exponentiation);
                    break;
                //Factorial Deepti
                case "factorial":
                case "fact":
                      long fact = Opera.factorial(Opera.acceptIntNum());
                      System.out.println("Factorial of the given number is : " + fact);
                       break;
                //Log Value Deepti
                case "log value":
                case "log val":
                      double logValue = Opera.logFunction(Opera.acceptDoubleNum());
                      System.out.println("Logarithm of the given number is : ");
                      System.out.printf("%.2f", logValue);
                      break;
                //Log Function Deepti
                case "log function":
                case "log func":
                        double log10Value = Opera.logFunction10(Opera.accepLongNum());
                        System.out.println("Logarithm of the given number is : ");
                        System.out.printf("%.2f", log10Value);
                        break;
                 //Anti Log Deepti
                 case "anti log":
                 case "anti logarithm":
                 case "inverse logarithm":
                 case "inverse log":
                        double antiLog = Opera.antiLog(Opera.acceptDoubleNum());
                        System.out.println("Inverse Logarithm of the given number is : ");
                        System.out.printf("%.2f", antiLog);
                          break;                        
                //Sine Al
                case "sine":
                case "sin":
                        System.out.print("Enter the angle in Degrees:\n");
                        double angleInDegrees = scan.nextInt();
                        double angleInRadians = Math.toRadians(angleInDegrees);
                        double sineValue = Math.sin(angleInRadians);
                        System.out.println("Sine of the given number is : " + sineValue);
                          break;
                //Cosine Al
                case "cosine":
                case "co sine":
                case "cosin":
                        System.out.print("Enter the angle in Degrees:\n");
                        double angleInDegrees = scan.nextInt();
                        double angleInRadians = Math.toRadians(angleInDegrees);
                        double cosValue = Math.cos(angleInRadians);
                        System.out.println("Cosine of the given number is : " + cosValue);
                          break;
                //Tangent Al
                case "tangent":
                case "tan":
                        System.out.print("Enter the angle in Degrees:\n");
                        double angleInDegrees = scan.nextInt();
                        double angleInRadians = Math.toRadians(angleInDegrees);
                        double tanValue = Math.tan(angleInRadians);
                        System.out.print("Tangent of the given number is : " + tanValue);
                          break;
                //Inverse Sine Al
                case "inverse sine":
                case "inverse sin":
                        System.out.print("Enter a value between -1 and 1:\n");
                        double sine = scan.nextDouble();
                        double inverseSineRadians = Math.asin(sine);
                        double inverseSineDegrees = Math.toDegrees(inverseSineRadians);
                        System.out.println("Inverse Sine of the given number is : " + inverseSineDegrees + " degrees");
                          break;
                //Inverse Cosine Al
                case "inverse cosine":
                case "inverse co sine":
                case "inverse cosin":
                        System.out.print("Enter a value between -1 and 1:\n");
                        double cos = scan.nextDouble();
                        double inverseCosRadians = Math.acos(cos);
                        double inverseCosDegrees = Math.toDegrees(inverseCosRadians);
                        System.out.println("Inverse Cosine of the given number is : " + inverseCosDegrees + " degrees");
                          break;
                //Inverse Tangent Al
                case "inverse tangent":
                case "inverse tan":
                        System.out.print("Enter a value between -1 and 1:\n");
                        double tan = scan.nextDouble();
                        double inverseTanRadians = Math.atan(tan);
                        double inverseTanDegrees = Math.toDegrees(inverseTanRadians);
                        System.out.println("Inverse Tan of the given number is : " + inverseTanDegrees + " degrees");
                         break;
                //Bunny Enda
                case "bunny":
                    Console.getBunny();
                    if (num1 <= 10) {
                        for (int i = 0; i < num1; i++) {
                            System.out.print("boing ");
                        }
                    } else if (num1 <= 100) {
                        int bigCat = num1.intValue() / 10;
                        for (int i = 0; i < bigCat; i++) {
                            System.out.print("boing ");
                        }
                    } else if (num1 <= 1000) {
                        int biggerCat = num1.intValue() / 100;
                        for (int i = 0; i < biggerCat; i++) {
                            System.out.print("boing ");
                        }
                    } else {
                        System.out.print("That's a big bunny!");
                    }

            }

/*
      //////////////////////////////   METHODS - SHARMIN  ///////////////////////////////////////
            //Subtraction Method
            public static double subtract(double a, double b) {
                return a - b; }
            //Multiplication Method
                public static double multiply(double a, double b) {
                    return a * b; }
            //Division Method
            public static double divide(double a, double b) {
                return a / b;}
            //Radians to Degrees
            public static double degrees(double a, double b) {
                double degrees = 0;
                double radians;
                return degrees;}
            //Degrees to Radians
            public static double radians(double a, double b) {
                double radians = 0;
                double degrees;
                return radians;}
     ///////////////////////////////   METHODS DEEPTI   ///////////////////////////////////////////
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
                return x;}
            // Square
            public static double square(double x2) {
                double square = Math.pow(x2, 2);
                return square;}
           //Square Root
            public static double squareRoot(double x1) {
                double result = Math.sqrt(x1);
                return result;}
            //Exponential
            public static double exponentiation(double x3) {
                double exponent = Math.exp(x3);
                return exponent;}
            //Factorial
            public static long factorial(long n1) {
                long result = 1L;
                for (long i = 1; i <= n1; i++) {result *= i;
                    return result;
                }
            }
            //Log Value
            public static double logFunction(double n1){
                double logvalue = Math.log(n1);
                return logvalue;}
            //Log Function
            public static double logFunction10(double n2) {
                double log10result = Math.log10(n2);
                return log10result;}
            //Anti Log
            public static double antiLog(double n1){
                double y = Math.log(n1); // Calculate the natural log of x
                double inverselog = Math.exp(y);
                //        double y = Math.log(n1) / Math.log(base); // Calculate log base 'base' of x
                //        double inverselog = Math.pow(base, y);
                return inverselog; }
            //
     //////////////////////////////////////////////////////////////////////////////////////////////
            //Quit Enda */
            toQuit = Console.toQuit("All done?");
            
              //Offer Memory Enda
            if (!(toQuit.equals("yes") || toQuit.equals("y"))) {
                String wantMem = Console.sendToMem("Want to send to Memory?");
                if (wantMem.equals("y")) {
                    System.out.println("Method to memory");
                    //Memory function Ron  
                    double memoryValue = 0.0;;
                    public void setMPlus(double value;) {
                    memoryValue += value;
                      }

                    public double getMRC() {
                    return memoryValue;
                      }
                
                  public void getMC() {
                    memoryValue = 0.0;
                      }
                }
            }
              //Reset and goodbye loop Enda
            System.out.println("toQuit value at end of loop: "+toQuit);
            if (!(toQuit.equals("yes") || toQuit.equals("y"))) {
                System.out.println("*********************************************");
                num1 = Console.getFirstDoubleInput("*             Enter a New Number             *");
            } else {
                    System.out.println("*********************************************");
                    System.out.println("*         Thank You for using the           *");
                    System.out.println("*.        Lycaena Tech Calculator!          *");
                    System.out.println("*********************************************");

            }
        } while (!(toQuit.equals("yes") || toQuit.equals("y")));

            }}
                 
