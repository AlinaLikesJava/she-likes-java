package com.sda.she_likes_java.strings;

public class StringsExample {

    public static void main(String[] args) {
        String name = "Alina";
        String surname = "Anisimova";
        int age = 23;
        // Hi, I'm (name) (surname). I am (age) old
        System.out.println("Hi, I'm " + name + " " + surname +". I am " + age + " old.");
        // %s means String wildcard
        // %d means number wildcard
        System.out.println(String.format("Hi, I'm %s %s. I am %d years old.",name, surname, age));
        System.out.println("Hi, I'm %s %s. I am %d old.".formatted(name, surname, age));
    }
}