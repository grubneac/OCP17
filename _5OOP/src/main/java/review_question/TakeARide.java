package review_question;

class Vehicle {
    static public String getModelName() { return "Volvo"; }
    public long getRegNo() { return 12345; }
}

class Car extends Vehicle {
    static public String getModelName() { return "Toyota"; }
    public long getRegNo() { return 54321; }
}

public class TakeARide {
    public static void main(String[] args) {
        Car c = new Car();
        Vehicle v = c;

        System.out.println("|" + v.getModelName() + "|" + c.getModelName() +
                "|" + v.getRegNo()     + "|" + c.getRegNo() + "|");
    }
}
