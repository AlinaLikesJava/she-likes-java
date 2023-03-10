package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class BouncerInDisco {
    public static void main(String[] args) {
        System.out.println("Want to get in?");
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Tell me how old are You");
        int personAge = inputReader.nextInt();

        System.out.println();
        System.out.println("Tell me your height");
        int personHeight = inputReader.nextInt();
        if (personHeight >= 150 & personAge >= 16) {
            System.out.println("Welcome to the club");
        } else {
            System.out.println("Grow up and come back kid");
        }

    }
}