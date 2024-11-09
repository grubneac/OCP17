package questions;

public class Student2 extends Person {
    protected long studNum;
    public Student2() { }
    public Student2(String name, long studNum) {
        super(name);
        this.studNum = studNum;
    }
}