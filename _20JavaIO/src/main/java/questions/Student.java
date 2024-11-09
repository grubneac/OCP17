package questions;

import java.io.Serializable;
public class Student extends Person implements Serializable {
    private long studNum;
    public Student(String name, long studNum) {
        super(name);
        this.studNum = studNum;
    }
    public String toString() { return "(" + name + ", " + studNum + ")"; }
}