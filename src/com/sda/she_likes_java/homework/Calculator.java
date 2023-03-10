package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class Calculator {
    // psvm - public static void main
    public static void main(String[] args) {
        System.out.println("com.sda.she_likes_java.homework.Calculator");
        System.out.println("calculating sum of two com.sda.she_likes_java.numbers");
        System.out.println("provide first number: ");
        int firstNumber;
        int secondNumber;
        // TODO: explain object creation
        Scanner inputReader = new Scanner(System.in);
        firstNumber = inputReader.nextInt();
        System.out.println("You provided number: " + firstNumber);
        System.out.println("Provide second number: ");
        secondNumber = inputReader.nextInt();
        System.out.println("You provided number: " + secondNumber);
        int sum = firstNumber + secondNumber;
        System.out.println("Sum is: " + sum);

        // \n - means put a new line here
        System.out.println();
        System.out.println("\n\n\n calculating the difference of two com.sda.she_likes_java.numbers");
        System.out.println("provide first number: ");
        int varOne;
        int varTwo;
        varOne = inputReader.nextInt();
        System.out.println("You provided number: " + varOne);
        System.out.println("Provide second number: ");
        varTwo = inputReader.nextInt();
        System.out.println("You provided number: " + varTwo);
        int difference = varOne - varTwo;
        System.out.println("Difference is: " + difference);


        System.out.println("calculating the product of two com.sda.she_likes_java.numbers");
        System.out.println("provide first number: ");
        int variableOne;
        int variableTwo;
        variableOne = inputReader.nextInt();
        System.out.println("You provided number: " + variableOne);
        System.out.println("Provide second number: ");
        variableTwo = inputReader.nextInt();
        System.out.println("You provided number: " + variableTwo);
        int product = variableOne * variableTwo;
        System.out.println("Product is: " + product);


        System.out.println("calculating the quotient of two com.sda.she_likes_java.numbers");
        System.out.println("provide first number: ");
        double variablOne;
        double variablTwo;
        variablOne = inputReader.nextInt();
        System.out.println("You provided number: " + variablOne);
        System.out.println("Provide second number: ");
        variablTwo = inputReader.nextInt();
        System.out.println("You provided number: " + variablTwo);
        double quotient = variablOne / variablTwo;
        System.out.println("Product is: " + quotient);
    }
}
