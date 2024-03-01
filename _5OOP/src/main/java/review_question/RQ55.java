package review_question;

public class RQ55 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Bob", 1234);
        Employee e2 = new Employee("Bob", 1234);
        System.out.print(e1.equals(e2));
        System.out.print(e1 == e2);
    }
}

record Employee(String name, double salary) { }