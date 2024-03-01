package questions;

import java.util.*;
public class MapModify {
    public static void main(String[] args) {

        NavigableMap<String, Integer> grades = new TreeMap<>();
        grades.put("A",  5); grades.put("B", 10); grades.put("C", 15);
        grades.put("D", 20); grades.put("E", 25);

        System.out.print(grades.get(grades.firstKey()) + " ");
        System.out.print(sumValues(grades.headMap("D")) + " ");
        System.out.print(sumValues(grades.subMap("B", false, "D", true)) + " ");
        grades.subMap(grades.firstKey(), false, grades.lastKey(), false).clear();
        System.out.println(sumValues(grades));
    }
    public static <K, M extends Map<K, Integer>> int sumValues(M freqMap) {
        return freqMap.values().stream().mapToInt(i->i).sum();
    }
}

/*
* Select the one correct answer.

a. 5 50 35 30
b. 5 30 35 30
c. 5 30 25 30
d. 5 30 35 75
*
* */