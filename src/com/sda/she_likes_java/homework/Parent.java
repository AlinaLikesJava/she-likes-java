package com.sda.she_likes_java.homework;

import com.sda.she_likes_java.classes.Address;
import com.sda.she_likes_java.classes.Person;

/*
Exercise 15.
Create a Parent class containing the following variables:
- first name
- surname
- address - (use the class Address)
- firstChild (use class Person)
- secondChild (use class Person)
 */
public class Parent {
    String name;
    String surname;
    Person firstChild;
    Person secondChild;

    Address address;



    public static void main(String[] args) {
        Parent mummy = new Parent();
        mummy.name = "Inese";
        mummy.surname = "Buda";
        Parent father = new Parent();
        father.name = "Rudolfs";
        father.surname = "Buda";

        Address myFirstAddress = new Address();
        myFirstAddress.street = "Graudu str.";

    }
}