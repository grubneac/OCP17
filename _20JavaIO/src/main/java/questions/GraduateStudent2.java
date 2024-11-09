package questions;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class GraduateStudent2 extends Student2 implements Serializable {
    private int year;
    public GraduateStudent2(String name, long studNum, int year) {
        super(name, studNum);
        this.year = year;
    }

    public String toString() {
        return "(" + name + ", " + studNum + ", " + year  + ")";
    }

    private void readObject(ObjectInputStream ois)
            throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        this.name = "NewName";
        this.studNum = 200;
        this.year = 2;
    }
}