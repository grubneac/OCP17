package review_question;

public enum Drill {
    ATTENTION("Attention!"), EYES_RIGHT("Eyes right!"),
    EYES_LEFT("Eyes left!"), AT_EASE("At ease!");

    private String command;

    Drill(String command) {
        this.command = command;
    }
    public static void main(String[] args) {
        System.out.println(ATTENTION);             // (1)
        System.out.println(AT_EASE);               // (2)
    }
}