package q21;

public enum FrequentFlyer {
    PLATINUM(20), GOLD(10), SILVER(5), BASIC(0);
    private double extra;

    FrequentFlyer(double extra) {
        this.extra = extra;
    }

    public static FrequentFlyer max(FrequentFlyer c1, FrequentFlyer c2) {
        return c1.compareTo(c2) < 0 ? c2 : c1;
    }

    public static FrequentFlyer max2(FrequentFlyer c1, FrequentFlyer c2) {
        return c1.extra < c2.extra ? c2 : c1;
    }

    public static void main (String[] args) {
        System.out.println(GOLD.ordinal() > SILVER.ordinal());
        System.out.println(max(GOLD, SILVER));
        System.out.println(max2(GOLD, SILVER));
    }
}
/*
* Select the one correct answer.

a. The program will compile and print:
false
SILVER
GOLD

b. The program will compile and print:
true
GOLD
SILVER

c. The program will compile and print:
true
GOLD
GOLD
* */