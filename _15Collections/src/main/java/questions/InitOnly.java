package questions;

import java.util.*;
public class InitOnly {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "Hi", "Hello");
        Collections.addAll(list1, "Howdy");
        System.out.println(list1);                       // (1)

        List<String> list2 = new ArrayList<>(list1);
        list2 = Arrays.asList("Hi", "Hello");
        list2 = Arrays.asList("Howdy");
        System.out.println(list2);                       // (2)
        List<String> list3 = new ArrayList<>();
        list3.addAll(list1);
        System.out.println(list3);                       // (3)

        List<String> list4 = new ArrayList<>(list2);
        System.out.println(list4);                       // (4)
    }
}

/*
* Select the four correct answers.

a. Line (1) will print [Howdy].
b. Line (1) will print [Hi, Hello, Howdy].
c. Line (2) will print [Howdy].
d. Line (2) will print [Hi, Hello, Howdy].
e. Line (3) will print [Howdy].
f. Line (3) will print [Hi, Hello, Howdy].
g. Line (4) will print [Howdy].
h. Line (4) will print [Hi, Hello, Howdy].
* */