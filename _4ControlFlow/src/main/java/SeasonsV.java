public class SeasonsV {
    enum Season {WINTER, SPRING, SUMMER, FALL, JANUARY}                    // (1)

    public static void main(String[] args) {
        int monthNumber = 2;
        Season season = switch (monthNumber) {                         // (2)
            case 12, 1, 2 -> {
                if (monthNumber == 1) yield Season.JANUARY;
                else yield Season.WINTER;
            }                            // (3)
            case 3, 4, 5 -> Season.SPRING;                             // (4)
            case 6, 7, 8 -> Season.SUMMER;                             // (5)
            case 9, 10, 11 -> {
                System.out.println("Yellow leaves in the fall.");
                yield Season.FALL;                                     // (6)
            }
            default -> throw new IllegalArgumentException(monthNumber +
                    " not a valid month.");
        };
        System.out.println(season);
    }
}