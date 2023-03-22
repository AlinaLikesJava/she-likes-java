package com.sda.she_likes_java.arrays;

import java.util.Random;

public class EnglishSchoolGrades {

    public static void main(String[] args) {
        int[] myGradesOnEnglishClass = new int[10000];

        Random gradeGenerator = new Random();

        for (int index = 0; index < myGradesOnEnglishClass.length; index++) {
            myGradesOnEnglishClass[index] = gradeGenerator.nextInt(7);
        }

        for (int index = 0; index < myGradesOnEnglishClass.length; index++) {
            System.out.println("my grade on index nr: " + index + " is: " + myGradesOnEnglishClass[index]);
        }
    }
}