package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        Console.println("Welcome to my calculator!");

        Scanner scan = new Scanner(System.in);
        System.out.print("Choose the option: ");
        System.out.print("\n1. Inverse \n 2.Square \n 3.Squareroot \n 4.Exponent \n 5.Sine \n 6.Cosine \n 7.Tangent \n 8.Inverse Sine \n 9.Inverse Cosine \n 10.Inverse Tangent \n");
        int operator = scan.nextInt();

        switch (operator) {
            case 5: {
                //sine
                System.out.print("Enter the angle in Degrees:\n");
                double angleInDegrees = scan.nextInt();
                double angleInRadians = Math.toRadians(angleInDegrees);
                double sineValue = Math.sin(angleInRadians);
                System.out.println("Sine of the given number is : " + sineValue);
                break;
            }
            case 6: {
                //cosine
                System.out.print("Enter the angle in Degrees:\n");
                double angleInDegrees = scan.nextInt();
                double angleInRadians = Math.toRadians(angleInDegrees);
                double cosValue = Math.cos(angleInRadians);
                System.out.println("Cosine of the given number is : " + cosValue);
                break;
            }
            case 7: {
                //tangent
                System.out.print("Enter the angle in Degrees:\n");
                double angleInDegrees = scan.nextInt();
                double angleInRadians = Math.toRadians(angleInDegrees);
                double tanValue = Math.tan(angleInRadians);
                System.out.print("Tangent of the given number is : " + tanValue);
                break;
            }
            //need to make sure I want these in degrees & maybe format the doubles
            case 8: {
                //inverse sine
                System.out.print("Enter a value between -1 and 1:\n");
                double sine = scan.nextDouble();
                double inverseSineRadians = Math.asin(sine);
                double inverseSineDegrees = Math.toDegrees(inverseSineRadians);
                System.out.println("Inverse Sine of the given number is : " + inverseSineDegrees + " degrees");
                break;
            }
            case 9: {
                //inverse cosine
                System.out.print("Enter a value between -1 and 1:\n");
                double cos = scan.nextDouble();
                double inverseCosRadians = Math.acos(cos);
                double inverseCosDegrees = Math.toDegrees(inverseCosRadians);
                System.out.println("Inverse Cosine of the given number is : " + inverseCosDegrees + " degrees");
                break;
            }
            case 10: {
                //inverse tangent
                System.out.print("Enter a value between -1 and 1:\n");
                double tan = scan.nextDouble();
                double inverseTanRadians = Math.atan(tan);
                double inverseTanDegrees = Math.toDegrees(inverseTanRadians);
                System.out.println("Inverse Tan of the given number is : " + inverseTanDegrees + " degrees");
                break;
            }
        }
    }
}
//        userInput1 = Console.getDoubleInput("Enter first number");
//        System.out.print(userInput1);
//        userInput2 = Console.getDoubleInput("\nEnter second number");
//        System.out.print(userInput2);


//Integer i = Console.getIntegerInput("Enter an integer");
//Double d = Console.getDoubleInput("Enter a double.");

//Console.println("The user input %s as a string", s);
//Console.println("The user input %s as a integer", i);
//Console.println("The user input %s as a d", d);







