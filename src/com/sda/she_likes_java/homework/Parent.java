package com.sda.she_likes_java.homework;

import com.sda.she_likes_java.classes.PersonExample;
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

    PersonExample.Address address;



    public static void main(String[] args) {
        Parent mummy = new Parent();
        mummy.name = "Inese";
        mummy.surname = "Buda";
        Parent father = new Parent();
        father.name = "Rudolfs";
        father.surname = "Buda";

        PersonExample.Address myFirstAddress = new PersonExample.Address();
        myFirstAddress.street = "Graud str.";

    }
}