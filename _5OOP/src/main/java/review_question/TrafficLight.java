package review_question;

public enum TrafficLight {
    RED("Stop"), YELLOW("Caution"), GREEN("Go");

    private String action;

    TrafficLight(String action) {
        this.action = action;
    }

    public static void main(String[] args) {
//        TrafficLight green = new TrafficLight("Go");
        TrafficLight green = TrafficLight.valueOf("GREEN");
        System.out.println(GREEN.equals(green));
    }
}