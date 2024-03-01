package org.example.questions;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.TreeSet;

import static java.lang.System.out;

public class RQ400A400 {
    public static void main(String[] args) {
        NavigableSet<String> strSetA = new TreeSet<>();
        Collections.addAll(strSetA, "sea", "shell", "soap", "swan");
        // (1) INSERT STATEMENT HERE
        out.println(strSetA.tailSet("soap", false));
    }
}

/*
* Which of the following statements, when inserted independently at (1),
*  will result in program output that does not include the word "shell"?
*
* Select the two correct answers.

* a.
out.println(strSetA.headSet("soap", true));

* b.
out.println(strSetA.headSet("soap", false));

* c.
out.println(strSetA.tailSet("soap", true));

* d.
out.println(strSetA.tailSet("soap", false));

* e.
out.println(strSetA.subSet("sea", false, "soap", true));

* f.
out.println(strSetA.subSet("sea", true, "soap", false));
*
* */