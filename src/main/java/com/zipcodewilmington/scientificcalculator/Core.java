package com.zipcodewilmington.scientificcalculator;


import java.lang.Math;

public class Core {


    int input1 = 0;
    int input2 = 0;

    public double square(int input1){
        double pow =  Math.pow(input1,2);
        return pow;
    }

    public double squareRoot(int input1){
        double sqrt = Math.sqrt(input1);
        return sqrt;
    }

    public double exp(int input1,int input2){
        double pow2 = Math.pow(input1,input2);
        return pow2;
    }


    //add method
    public Double sum(input1){
        Double sumValue = Console.getDoubleInput("Enter the value you want to sum.");

        return input1+sumValue;
    }

    //Subtraction
    public Double subtract(input1){
        Double subtractValue = Console.getDoubleInput("Enter the value you want to subtract.");

        return input1-subtractValue;

    }

    //Multiplication
    public Double multiply(input1){
        Double multiplyValue = Console.getDoubleInput("Enter the value you want to multiply.");

        return input1*multiplyValue;

    }

    //Division
    public Double divide(input1){
        Double divideValue = Console.getDoubleInput("Enter the value you want to divide.");

        return input1/divideValue;

    }


    //Maisha
    public double invertSign(double input1) {
        return input1 = -input1;
    }

    public double inverse(double input1) {
        return input1 = 1/input1;
    }

    

}








