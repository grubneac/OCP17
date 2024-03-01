public class Switching {
    public static void main(String[] args) {
        final int iLoc = 3;
        switch (6) {
            case 1:
            case iLoc:
            case 2 * iLoc:
                System.out.println("I am not OK.");
            default:
                System.out.println("You are OK.");
            case 4:
                System.out.println("It's OK.");
        }
        int price = 1;
        int discount = switch (price) {
            case 5, 1, 2 -> price - 1;
            case 4, 3, 6 -> price - 2;
            default      -> 0;
        };
        System.out.println(discount);
    }

}