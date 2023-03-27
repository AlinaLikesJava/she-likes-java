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
public class Parent2 {
    String name;
    String surname;
    Person firstChild;
    Person secondChild;

    PersonExample.Address address;


    public static void main(String[] args) {
        PersonExample.Address someAddress = new PersonExample.Address();
        someAddress.country = "Latvia";
    }
}
