package com.sda.she_likes_java.loops.do_while;

public class DoWhileLoop {

    public static void main(String[] args) {
        boolean isAdult = false;
        do {
            System.out.println("Can You see this line??");
        } while (isAdult);

        // if false, is executed at least once
        // if true, is executed an endless amount of time
    }
}