package q26;

public class Student extends Person {
    protected long studNum;
    Student() { }
    Student(String name, long studNum) {
        super(name);
        this.studNum = studNum;
    }
}
