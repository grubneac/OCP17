package questions;

import java.util.*;
public class WhatIsThis {
    public static void main(String[] args) {
        List<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("B"));
        list.add(new StringBuilder("A"));
        list.add(new StringBuilder("C"));
        list.sort(Collections.reverseOrder());
        System.out.println(list.subList(1,2));
    }
}

/*
* Select the one correct answer.

a. The program will compile. When run, it will print [B].
b. The program will compile. When run, it will print [B, A].
c. The program will compile. When run, it will throw an exception.
d. The program will fail to compile.
* */
