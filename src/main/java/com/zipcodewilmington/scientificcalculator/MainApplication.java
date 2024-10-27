package com.zipcodewilmington.scientificcalculator;


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
                //Addition
                case "+":
                case "add":
                case "addition":
                case "plus":
                    System.out.println("added");
                    break;
                //Subtraction
                case "-":
                case "sub":
                case "subtraction":
                case "minus":
                    System.out.println("subbed");
                    break;
                //Multiplication
                case "x":
                case "times":
                case "multiply":
                case "multiplication":
                    System.out.println("times");
                    break;
                //Division
                case "/":
                case "divide":
                case "division":
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
                //Square
                case "square":
                    System.out.println("squared");
                    break;

                //Bunny
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
            toQuit = Console.toQuit("All done?");
            
              //Memory
            if (!(toQuit.equals("yes") || toQuit.equals("y"))) {
                String wantMem = Console.sendToMem("Want to send to Memory?");
                if (wantMem.equals("y")) {
                    System.out.println("Method to memory");
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
                } else {

                }
            }

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
