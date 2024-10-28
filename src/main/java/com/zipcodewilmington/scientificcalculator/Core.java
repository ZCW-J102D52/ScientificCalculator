package com.zipcodewilmington.scientificcalculator;


import java.lang.Math;
import java.util.Scanner;

public class Core {

    /*Scanner sc = new Scanner(System.in);

     switch (Calculator) {
        case '*':
            System.out.println(getMultiply);
            break;
        case 'multiply '

            int input1 = 0;
    int input2 = 0;
    */

    public double square(double input1) {
        double pow = Math.pow(input1, 2);
        return pow;
    }

    public double squareRoot(double input1) {
        double sqrt = Math.sqrt(input1);
        return sqrt;
    }

    public double exp(double input1, double input2) {
        double pow2 = Math.pow(input1, input2);
        return pow2;
    }


    //add method
   /* public double sum(double input1, double input2) {
        //Double sumValue = Console.getDoubleInput("Enter the value you want to sum.");

        return input1 + input2;
    }

    //Subtraction
    public Double subtract(double input1, double inout2) {
        Double subtractValue = Console.getDoubleInput("Enter the value you want to subtract.");

        return input1 - subtractValue;

    }

    //Multiplication
    public Double multiply(double input1) {
        Double multiplyValue = Console.getDoubleInput("Enter the value you want to multiply.");

        return input1 * multiplyValue;

    }

    //Division
    public Double divide(double input1) {
        Double divideValue = Console.getDoubleInput("Enter the value you want to divide.");

        return input1 / divideValue;

    }*/

    //Gabi
    //change number
    public double ChangeNumber(double input1,double input2) {
        //Double sumValue = Console.getDoubleInput("Enter the value you want to sum.");

        return input1 = input2;
    }

    // add method
    public double sum(double input1,double input2) {
        //Double sumValue = Console.getDoubleInput("Enter the value you want to sum.");

        return input1 + input2;
    }

    //Subtraction
    public Double subtract(double input1,double input2) {

        return input1 - input2;

    }

    //Multiplication
    public Double multiply(double input1,double input2) {

        return input1 * input2;

    }

    //Division
    public Double divide(double input1,double input2 ) {

        return input1 / input2;

    }

    //Maisha
    public double invertSign(double input1) {
        return input1 = -input1;
    }

    public double inverse(double input1) {
        return input1 = 1 / input1;
    }

    //Kayan - Update the display to Err if an error occurs (eg: Division by zero)
    public static void updateDisplay() {
        System.out.println("Err");
    }

    //Added a private attribute named errorOccurred
    private boolean errorOccurred;

    //In the Constructor need to set errorOccurred initially to false
    public Core(){ this.errorOccurred = false;}

    //Errors must be cleared before any other operation can take place
    public void clearErrorOnDisplay() {
        System.out.println("Clearing error...");
        errorOccurred = false;
    }
}