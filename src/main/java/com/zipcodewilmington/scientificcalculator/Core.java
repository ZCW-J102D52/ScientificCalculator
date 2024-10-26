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
}