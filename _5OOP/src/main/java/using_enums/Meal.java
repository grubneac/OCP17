package using_enums;

public enum Meal {
    // Each enum constant defines a constant-specific class body
    BREAKFAST(7,30) {                                                   // (1)
        @Override
        public double mealPrice(Day day) {                                // (2)
            double breakfastPrice = foodPrice * 1.05;
            if (day.equals(Day.SATURDAY) || day == Day.SUNDAY)
                breakfastPrice *= 1.5;
            return breakfastPrice;
        }
        @Override
        public String toString() {                                        // (3)
            return "Breakfast";
        }
    },                                                                  // (4)
    LUNCH(12,15) {
        @Override
        public double mealPrice(Day day) {                                // (5)
            double lunchPrice = foodPrice *  2.050;
            return switch (day) {
                case SATURDAY, SUNDAY->
                    lunchPrice * 2.0;
                default-> lunchPrice;
            };
//            return lunchPrice;
        }
        @Override
        public String toString() {
            return "Lunch";
        }
    },
    DINNER(19,45) {
        @Override
        public double mealPrice(Day day) {                                // (6)
            double dinnerPrice = foodPrice * 2.550;
            if (day.compareTo(Day.SATURDAY) >= 0 && day.compareTo(Day.SUNDAY) <= 0)
                dinnerPrice *= 2.5;
            return dinnerPrice;
        }
        @Override
        public String toString() {
            return this.name().toLowerCase();
        }
    };

    // Abstract method implemented in constant-specific class bodies.
    abstract double mealPrice(Day day);                                 // (7)

    // Enum constructor:
    Meal(int hh, int mm) {
        this.hh = hh;
        this.mm = mm;
    }

    // Instance fields: Time for the meal.
    private int hh;
    private int mm;

    double foodPrice = 10;

    // Instance methods:
    public int getHour() { return this.hh; }
    public int getMins() { return this.mm; }
    public String getTimeString() {                              // "hh:mm"
        return String.format("%02d:%02d", this.hh, this.mm);
    }
}