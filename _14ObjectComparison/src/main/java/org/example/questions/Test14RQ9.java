package org.example.questions;
import java.util.Objects;
class Album1 {
    private String title;
    public Album1(String title) { this.title = title; }
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.title);
        return hash;
    }
    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj == null) { return false; }
        if (getClass() != obj.getClass()) { return false; }
        final Album1 other = (Album1) obj;
        return Objects.equals(this.title, other.title);
    }
}

class LP extends Album1 {
    public LP(String title) { super(title); }
}

public class Test14RQ9 {
    public static void main(String[] args) {
        Album1 a1 = new Album1("Some Music");
        Album1 a2 = new LP("Some Music");
        if (a1.equals(a2)) {
            System.out.println("Same album");
        } else {
            System.out.println("These are different albums");
        }
    }
}

/*
* What is the result?
Select the one correct answer.
a. Same album
b. These are different albums
c. The program will throw an exception at runtime.
d. The program will fail to compile.
* */