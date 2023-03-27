package com.sda.she_likes_java.classes;

public class PersonExample {

    public static void main(String[] args) {
        System.out.println("Let's use our newly created class Person");

        // number is primitive variable
        int number = 1;
        String name = "Mariusz";
        String empty = "";
        String nullString = null;
        nullString = "aha";

        // me is object variable
        // me is reference to object
        Person me = new Person();
        me.name = "Alina";
        Person you = new Person();
        you.name = "Maya";
        System.out.println();


        System.out.println("My name currently is: " + me.name);
        System.out.println("You name currently is: " + you.name);
    }

    public static class Address {
        public String country;
        public String city;
        public String street;
        public int postalCode;
        public int streetNumber;



        public static void main(String[] args) {
            Address myFirstAddress = new Address();
            myFirstAddress.country = "Latvia";
            myFirstAddress.city = "Riga";
            myFirstAddress.street = "Graudu str.";
            myFirstAddress.streetNumber = 30;
            myFirstAddress.postalCode = 1058;


            Address mySecondAddress = new Address();
            mySecondAddress.country = "Latvia";
            mySecondAddress.city = "Olaine";
            mySecondAddress.street = "Dalbes str.";
            mySecondAddress.postalCode = 2114;



            System.out.println("City from first address: " + myFirstAddress.city);
            System.out.println("City from second address: " + mySecondAddress.city);
        }
    }
}