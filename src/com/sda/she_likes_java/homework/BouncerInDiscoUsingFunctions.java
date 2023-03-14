package com.sda.she_likes_java.homework;

public class BouncerInDiscoUsingFunctions {

    public static void main(String[] args) {
        System.out.println("Let's start calculations");

        checkedByYoungBouncer (15,180, true);

        System.out.println("Sorry, you can't come in");


    }

     public static boolean checkedByYoungBouncer(int age, int height, boolean isAbleToSingWell) {
        System.out.println("I will check if you may come in");


         boolean checkedByYoungBouncer = age >= 18 || height >= 190 || isAbleToSingWell;
        return true;

    }}


