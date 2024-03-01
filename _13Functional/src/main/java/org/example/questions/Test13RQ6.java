package org.example.questions;

import java.util.*;
public class Test13RQ6 {
    public static void main(String[] args) {
        List<String> values
                = new ArrayList<>(List.of("ANNA","JANE","ALICE","JOHN"));
        values.removeIf(s -> s.toLowerCase().startsWith("a"));
        System.out.println(values);
    }
}