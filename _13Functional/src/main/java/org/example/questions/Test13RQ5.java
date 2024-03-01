package org.example.questions;

import java.util.*;
public class Test13RQ5 {
    public static void main(String[] args) {
        List<String> values = new ArrayList<>(List.of("ONE","TWO","THREE","FOUR"));
        values.removeIf(s -> s.length() == 3);
        int sum = 0;
        for (String value: values) {
            sum += value.length();
        }
        System.out.println(sum);
    }
}
