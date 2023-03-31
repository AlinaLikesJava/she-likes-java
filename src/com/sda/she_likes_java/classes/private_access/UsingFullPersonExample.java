package com.sda.she_likes_java.classes.private_access;

import com.sda.she_likes_java.classes.constructor.FullPerson;

public class UsingFullPersonExample {

    // So, steps: 1) private access modifier to Class,
    // 2) get
    // 3) set (with if conditions).
    public static void main(String[] args) {
        FullPerson maybeMe = new FullPerson("Alina", "A.", 23, null);
       // maybeMe.age = -1;
        System.out.println("My age: " + maybeMe.getAge());
        maybeMe.setAge(-1);
        System.out.println("me after failed trial to decrease age: " + maybeMe);
    }
}
