package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
import com.google.inject.internal.util.Strings;
import javax.swing.*;
import java.util.Scanner;
import java.lang.Math;


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
                    double plus2 = Console.getSecondDoubleInput("Enter Second number:");
                    System.out.println("Result: " + Opera.addition(num1, plus2));
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
                //Divide by zero error Ron

                // Divide by zero error Ron
                //try {

//                  } catch (ArithmeticException e) {
//                    System.out.println("You are not allowed to divide by zero.");
//                  } catch (Exception e) {
//                    System.out.println("Error: Please try again");
//                 } finally {
//                      System.out.println("Please continue");
//                  }

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
                case "sqrt":
                    double root = Opera.squareRoot(Opera.acceptDoubleNum());
                    System.out.println("SquareRoot of the given number is : ");
                    System.out.printf("%.2f", root);
                    break;
                //Exponential Deepti
                case "exponential":
                case "expo":
                case "exponent":

                    //Exponentiation
                    double[] input = Opera.acceptArrayInput();
                    double exponentiation = Opera.exponentiation(input[0], input[1]);
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
                    double sinValue = Opera.sin(Opera.acceptIntNum());
                    System.out.println("Sine of the given number is :" + sinValue + " radians.");
                    break;
                //code below is what I had before making sin into a method
//                        System.out.print("Enter the angle in Degrees:\n");
//                        double angleInDegrees = Opera.acceptIntNum();
//                        double angleInRadians = Math.toRadians(angleInDegrees);
//                        double sineValue = Math.sin(angleInRadians);
//                        System.out.println("Sine of the given number is : " + sineValue);
//                        break;
                //Cosine Al
                case "cosine":
                case "co sine":
                case "cosin":
                    double cosValue = Opera.cos(Opera.acceptIntNum());
                    System.out.println("Cosine of the given number is :" + cosValue + " radians.");
                    break;
                //What I had before making a method
//                        System.out.print("Enter the angle in Degrees:\n");
//                        double angleInDegreesCos = Opera.acceptIntNum();
//                        double angleInRadiansCos = Math.toRadians(angleInDegreesCos);
//                        double cosValue = Math.cos(angleInRadiansCos);
//                        System.out.println("Cosine of the given number is : " + cosValue);
//                          break;
                //Tangent Al
                case "tangent":
                case "tan":
                    double tanValue = Opera.tan(Opera.acceptIntNum());
                    System.out.println("Tangent of the given number is :" + tanValue + " radians.");
                    break;
//                        System.out.print("Enter the angle in Degrees:\n");
//                        double angleInDegreesTan = Opera.acceptIntNum();
//                        double angleInRadiansTan = Math.toRadians(angleInDegreesTan);
//                        double tanValue = Math.tan(angleInRadiansTan);
//                        System.out.print("Tangent of the given number is : " + tanValue);
//                          break;
                //Inverse Sine Al
                case "inverse sine":
                case "inverse sin":
                    int invSinValue = Opera.invSin(Opera.acceptIntNum());
                    System.out.println("Inverse sine of the given value is :" + invSinValue + " degrees.");
                    break;
                //what I had before making method
//                        System.out.print("Enter a value between -1 and 1:\n");
//                        double sine = Opera.acceptDoubleNum();
//                        double inverseSineRadians = Math.asin(sine);
//                        double inverseSineDegrees = Math.toDegrees(inverseSineRadians);
//                        System.out.println("Inverse Sine of the given number is : " + inverseSineDegrees + " degrees");
//                        break;
                //Inverse Cosine Al
                case "inverse cosine":
                case "inverse co sine":
                case "inverse cosin":
                    int invCosValue = Opera.invCos(Opera.acceptIntNum());
                    System.out.println("Inverse Cosine of the given value is :" + invCosValue + " degrees.");
                    break;
                //what I had before making method
//                        System.out.print("Enter a value between -1 and 1:\n");
//                        double cos = Opera.acceptDoubleNum();
//                        double inverseCosRadians = Math.acos(cos);
//                        double inverseCosDegrees = Math.toDegrees(inverseCosRadians);
//                        System.out.println("Inverse Cosine of the given number is : " + inverseCosDegrees + " degrees");
//                          break;
                //Inverse Tangent Al
                case "inverse tangent":
                case "inverse tan":
                    int invTanValue = Opera.invTan(Opera.acceptIntNum());
                    System.out.println("Inverse Tangent of the given value is :" + invTanValue + " degrees.");
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
        }
        while (!(toQuit.equals("yes") || toQuit.equals("y"))) ;

//         }  catch(ArithmeticException e){
//         System.out.println("You are not allowed to divide by zero.");
//     } catch(Exception e){
//         System.out.println("Error: Please try again");
//     } finally{
//         System.out.println("Please continue");
//         }

        //////////////////////////////////////////////////////////////////////////////////////////////
        //Quit Enda
        toQuit = Console.toQuit("All done?");


        //Offer Memory Enda
        if (!(toQuit.equals("yes") || toQuit.equals("y"))) {
            String wantMem = Console.sendToMem("Want to send to Memory?");
            if (wantMem.equals("y")) {
                System.out.println("Method to memory");
                //Memory function Ron
                double memoryValue = 0.0;
                ;
                /*public void setMPlus ( double value;){
                    memoryValue += value;
                }

                public double getMRC () {
                    return memoryValue;
                }

                public void getMC () {
                    memoryValue = 0.0;
                }*/
            }
        }

//            
        //Reset and goodbye loop Enda
        System.out.println("toQuit value at end of loop: " + toQuit);
        if (!(toQuit.equals("yes") || toQuit.equals("y"))) {
            System.out.println("*********************************************");
            num1 = Console.getFirstDoubleInput("*             Enter a New Number             *");
        } else {
            System.out.println("*********************************************");
            System.out.println("*         Thank You for using the           *");
            System.out.println("*.        Lycaena Tech Calculator!          *");
            System.out.println("*********************************************");

        }

    }
}
