package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class BouncerInDiscoUsingFunctions {

    public static void main(String[] args) {
        System.out.println("Let's start the party");
        System.out.println("The party begins, a lot of people are coming to the club");

        var input = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = input.nextInt();
        System.out.println("What is your height?");
        int height = input.nextInt();
        System.out.println("Can you sing?");
        boolean isAbleToSingWell = input.nextBoolean();

        if (checkedByYoungBouncer(height, age, isAbleToSingWell)) {

        }


        checkedByYoungBouncer (15,180, true);

        System.out.println("No, you cant come in");
    }

     public static boolean checkedByYoungBouncer(int age, int height, boolean isAbleToSingWell) {



         boolean checkedByYoungBouncer = age >= 18 || height >= 190 || isAbleToSingWell;
        return true; }
    { System.out.println("Welcome!");

    }}


