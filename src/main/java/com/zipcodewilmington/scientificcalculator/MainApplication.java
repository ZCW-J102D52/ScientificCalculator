package com.zipcodewilmington.scientificcalculator;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Scanner;
/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
//        Console.println("Welcome to my calculator!");
//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");
//
//
//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
//        Console.println("The user input %s as a d", d);
//        // thought process
        //use switch to implement core equations
        // in the cases you would use whatever problem you want so if the case = a getDivide or getMultiply you print out the division code
        // if nothing is used it will defult to 0

              Scanner sc = new Scanner(System.in);
         /*     System.out.println("Press "*" for multiplication");
              System.out.println("Press + for addition");
              System.out.println("Your sum is");*/
        System.out.println(0);
        int Calculator= sc.nextInt();
       {     int a = 3;
               int b =5;
            int getMultiply = 0;
            for (int i = 0; i < a; i++) {
                getMultiply += b;

            }

            switch (Calculator) {
                case '*':
                    System.out.println(getMultiply);
                 break;
                 case 'multiply '


            }
        }
        // Caculator = sc.nextInt();


             /*switch(Caculator)
              {
                  case 1: System.out.println(a);
                  break;
                 /* case 2: System.out.println(2+2);
                  break;
                  default: System.out.println(0);*/


//        int y = 0;
//       switch(y) {
//           case 0:
//               System.out.println("=0");
//           case //get multiply:
//               System.out.println(//sum);
//                                  case (2*2)://getDivide
//                                  System.out.println( );//sum
//                                                     default:
//                                                         System.print.println(return y);
// breaks and well if I type additon
       }

        }





