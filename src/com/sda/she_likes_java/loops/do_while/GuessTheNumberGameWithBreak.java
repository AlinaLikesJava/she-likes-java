package com.sda.she_likes_java.loops.do_while;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGameWithBreak {

    public static void main(String[] args) {
        Random numberGenerator = new Random();
        int someRandomNumber = numberGenerator.nextInt(20);
        int numberOfTrials = 8;

        //System.out.println("random number provided by java is: " + someRandomNumber);

        Scanner inputReader = new Scanner(System.in);
        int userAnswer;
        boolean guessed = false;


        System.out.println("Play game with me:)");
        do {
            System.out.println("Guess a number between 1 and 10");
            userAnswer = inputReader.nextInt();
            numberOfTrials--;
            guessed = userAnswer == someRandomNumber;

        } while (!guessed && numberOfTrials >0);

        if (guessed) {
            System.out.println("Great! You won!");
        }
        else {
            System.out.println("You lost :(");

        }


    }
}
