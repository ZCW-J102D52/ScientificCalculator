package com.zipcodewilmington.scientificcalculator;
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
                    System.out.println("Enter second number:");
                    double num2 = scanner.nextDouble();
                    System.out.println("Result: " + add(num1, num2));
   
                    public static double add(double a, double b) {
                    return a + b;
                       }
                    break;
                //Subtraction Sharmin
                case "-":
                case "sub":
                case "subtraction":
                case "minus":
                    System.out.println("Enter second number:");
                    double num2 = scanner.nextDouble();
                    System.out.println("Result: " + subtract(num1, num2));
                    
                    public static double subtract(double a, double b) {
                    return a - b;
                      }    
                    break;
                //Multiplication Sharmin
                case "x":
                case "times":
                case "multiply":
                case "multiplication":
                    System.out.println("Enter second number:");
                    double num2 = scanner.nextDouble();
                    System.out.println("Result: " + multiply(num1, num2));
                
                    public static double multiply(double a, double b) {
                    return a * b;
                      }
                    break;
                //Division Sharmin
                case "/":
                case "divide":
                case "division":
                    System.out.println("Enter second number:");
                    double num2 = scanner.nextDouble();
                    System.out.println("Result: " + divide(num1, num2));
                    
                    public static double divide(double a, double b) {
                    return a / b;
                      }
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
                    System.out.println("dived");
                    break;
              //Radians to Degrees Sharmin  
                case "radians to degrees":
                case "rads to degs":
                case "r to d":
                    double degrees = num1;
                    System.out.println(Math.toRadians(degrees));
                
                    public static double degrees(double a, double b) {
                    double degrees = 0;
                    double radians;
                    return degrees;
                      }
                    break;
              //Degrees to Radians Sharmin
                case "degrees to radians":
                case "degs to rads":
                case "d to r":
                    double radians = num1;
                    System.out.println(Math.toDegrees(radians));
                   
                public static double radians(double a, double b) {
                    double radians = 0;
                    double degrees;
                    return radians;
                      }
                  break;
                //Square
                case "square":
                    System.out.println("squared");
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
            //Quit Enda
            toQuit = Console.toQuit("All done?");
            
              //Offer Memory Enda
            if (!(toQuit.equals("yes") || toQuit.equals("y"))) {
                String wantMem = Console.sendToMem("Want to send to Memory?");
                if (wantMem.equals("y")) {
                    System.out.println("Method to memory");
                    //Memory function Ron  
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



    }

}
