package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class SwitchDisplayMode {

/*
    Switch display mode (binary, octal, decimal, hexadecimal)
    switchDisplayMode() should rotate through the options
    switchDisplayMode(String mode) should set the display to the mode given
/*
*/
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int input1 = 0;
        switch (operator) {
            case "binary":
                System.out.print("This number in binary is " + Integer.toBinaryString((int) input1));
                break;
            case "octal":
                System.out.print("This number in octal is " + Integer.toOctalString((int) input1));
                break;
            case "decimal":
                System.out.print("This number in decimal is " + String.valueOf(input1));
                break;
            case "hexadecimal":
                System.out.print("This number in hexadecimal is " + Integer.toHexString((int) input1).toUpperCase());
                break;


}

}
