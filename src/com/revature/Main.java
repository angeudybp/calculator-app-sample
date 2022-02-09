package com.revature;

import java.util.Scanner;

class Calculator{
    public double firstNumber;
    public double secondNumber;


    public Calculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    public double Addition(){
        return firstNumber+secondNumber;
    }
    public double subtraction(){
        return firstNumber-secondNumber;
    }
    public double multiplication(){
        return firstNumber*secondNumber;
    }
    public void division(){

        if (secondNumber == 0){
            System.err.println("Cannot divide by 0");

        }else {
            System.out.println("Result: "+ (firstNumber/secondNumber));
        }

    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        boolean cont = true;

        do {
            System.out.println("------------Calculator App------------");
            System.out.println("Enter First number: ");
            double firstNumber = scanner.nextDouble();
            System.out.println("Enter Second number: ");
            double secondNumber = scanner.nextDouble();
            System.out.println("Select an Option: ");
            System.out.println("1- Add\n2- Subtract \n3- Multiply \n4- Divide \n5- exit");
            int selection = scanner.nextInt();
            Calculator calculator = new Calculator(firstNumber, secondNumber);
            switch (selection) {
                case 1 -> System.out.println("Result: " + calculator.Addition());
                case 2 -> System.out.println("Result: " + calculator.subtraction());
                case 3 -> System.out.println("Result: " + calculator.multiplication());
                case 4 -> calculator.division();
                case 5 -> {
                    System.out.println("Goodbye :)!");
                    cont = false;
                }
                default -> System.out.println("wrong input!");
            }
        }while (cont);




    }
}
