package q26;

public class Person {
    protected transient String name;
    Person() { this.name = "NoName"; }
    Person(String name) { this.name = name; }
}
