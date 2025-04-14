package q26;

import java.io.Serializable;
public class GraduateStudent extends Student implements Serializable {
    private int year;
    GraduateStudent(String name, long studNum, int year) {
        super(name, studNum);
        this.year = year;
    }

    public String toString() {
        return "(" + name + ", " + studNum + ", " + year + ")";
    }
}