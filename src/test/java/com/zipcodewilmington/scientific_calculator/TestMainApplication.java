package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.InverseFunction;
import com.zipcodewilmington.scientificcalculator.MainApplication;
import com.zipcodewilmington.scientificcalculator.Opera;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

    //Testing Scientific functions
    @Test
    public void testSquareRoot() {
        Opera operaSqRt = new Opera();
        double result = operaSqRt.squareRoot(4);
        assertEquals(2, result, 0.001);
    }

    @Test
    public void testsquare() {
        Opera operaSq = new Opera();
        double sq = operaSq.square(2);
        assertEquals(4, sq, 0.001);

    }

    @Test
    public void exponentiation() {
        Opera operaExp = new Opera();
        double exp = operaExp.exponentiation(2);
        assertEquals(7.38905609893065, exp, 0.001);

    }

    @Test
    public void factorial() {
        Opera operaFact = new Opera();
        double fact = operaFact.factorial(3);
        assertEquals(6, fact, 0.001);

    }

    @Test
    public void calculateInverse() {
        InverseFunction Inverse = new InverseFunction();
        double result = Inverse.inverseNumF(4);
        assertEquals(0.25, result, 0.001);

    }

    @Test
    public void calculateInverse1() {
        InverseFunction Inverse = new InverseFunction();
        double result = Inverse.inverseNumF(4);
        assertEquals(0.25, result, 0.001);

    }

    @Test
    public void Logarithmicfunc() {
        Opera operaLog = new Opera();
        double logresult = operaLog.logFunction(10);
        assertEquals(2.302585, logresult, 0.001);

    }

    @Test
    public void Logarithmicfunc10() {
        Opera operaLog10 = new Opera();
        double log10result = operaLog10.logFunction10(10);
        assertEquals(1, log10result, 0.001);
    }

    @Test
    public void inverseLogarithmicfunc() {
        Opera operaInvLog = new Opera();
        double inverselogresult = operaInvLog.antiLog(10);
        assertEquals(10, inverselogresult, 0.001);
    }

    @Test
    public void sinTest() {
        Opera operaSin = new Opera();
        double sinResult = operaSin.sin(90);
        assertEquals(1, sinResult);
    }

    @Test
    public void cosTest() {
        Opera operaCos = new Opera();
        double cosResult = operaCos.cos(90);
        assertEquals(0, cosResult);
    }

    @Test
    public void tanTest() {
        Opera operaTan = new Opera();
        double tanResult = operaTan.tan(45);
        assertEquals(1, tanResult);
        //might need this as parameters for above (Opera.sin(45)/Opera.cos(45)
    }

    @Test
    public void invSinTest() {
        Opera operaInvSin = new Opera();
        int invSinResult = operaInvSin.invSin(1);
        assertEquals(90, invSinResult);
    }

    @Test
    public void invCosTest() {
        Opera operaInvCos = new Opera();
        int invCosResult = operaInvCos.invCos(1);
        assertEquals(0, invCosResult);
    }

    @Test
    public void invTanTest() {
        Opera operaInvTan = new Opera();
        int invTanResult = operaInvTan.invTan(1);
        assertEquals(45, invTanResult);
    }

}

