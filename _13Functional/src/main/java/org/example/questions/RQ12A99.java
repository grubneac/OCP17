package org.example.questions;

interface Funky1    { void    absMethod1(String s); }
interface Funky2    { String  absMethod2(String s); }

public class RQ12A99 {
    public static void main(String[] args) {

        Funky1 p1;
//        p1 = s -> System.out.println(s);           // (1)
//        p1 = s -> s.length();                      // (2)
//        p1 = s -> s.toUpperCase();                 // (3)
//        p1 = s -> { s.toUpperCase(); };            // (4)
//        p1 = s -> { return s.toUpperCase(); };     // (5)
//
//        Funky2 p2;
//        p2 = s -> System.out.println(s);           // (6)
//        p2 = s -> s.length();                      // (7)
//        p2 = s -> s.toUpperCase();                 // (8)
//        p2 = s -> { s.toUpperCase(); };            // (9)
//        p2 = s -> { return s.toUpperCase(); };     // (10)
    }
}

/*
* Select the four correct answers.

  which will fail to compile.
* */