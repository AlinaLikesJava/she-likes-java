package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class BouncerInDiscoStoryV20 {
    public static void main(String[] args) {
        System.out.println("The party begins, a lot of people are coming to the club");

        System.out.println("The young bouncer asks,");
        System.out.println("Hi, how old are you? ");

        Scanner inputReader = new Scanner(System.in);
        String declineMessage = "Sorry, you can't come in";
        int age = inputReader.nextInt();
        System.out.println("What is your height? ");
        int height = inputReader.nextInt();
        System.out.println("Can you sing well? ");
        boolean canSing = inputReader.nextBoolean();


        boolean isAllowedToParty = age >= 18 && height >= 190 && canSing;

        if (isAllowedToParty) {
            System.out.println("Welcome to the club!");
        } else {
            System.out.println(declineMessage);
            System.out.println("The people try again. They come up to the old bouncer");
            System.out.println("The old bouncer asks,");
            System.out.println("Hi, how old are you? ");
            int age2 = inputReader.nextInt();
            System.out.println("What is your height? ");
            int height2 = inputReader.nextInt();
            System.out.println("Can you sing well? ");
            boolean canSing2 = inputReader.nextBoolean();

            boolean isAllowedToParty2 = age2 >= 18 || height2 >= 190 || canSing2;

            if (isAllowedToParty2) {
                System.out.println("Welcome to the club!");

        } else {
            System.out.println(declineMessage);
        }
    }}}
