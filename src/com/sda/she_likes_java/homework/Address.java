package com.sda.she_likes_java.classes;

public class Address {
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