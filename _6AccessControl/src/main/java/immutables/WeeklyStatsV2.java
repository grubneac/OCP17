package immutables;

import java.util.Arrays;

public class WeeklyStatsV2 {                   // (1) Class is not final.
    private final String description;           // (2) Immutable string
    private final int weekNumber;               // (3) Immutable primitive value
    private final int[] stats;                  // (4) Mutable int array
    private WeeklyStatsV2(String description,
                          int weekNumber, int[] stats) {           // (5a) Private constructor
        this.description = description;
        this.weekNumber = weekNumber;
        this.stats = Arrays.copyOf(stats, stats.length); // Create a private copy.
    }

    // (5b) Static factory method to construct objects.
    public static WeeklyStatsV2 getNewWeeklyStats(String description,
                                                  int weekNumber, int[] stats) {
        if (weekNumber <= 0 || weekNumber > 52) {
            throw new IllegalArgumentException("Invalid week number: " + weekNumber);
        }
        if (stats.length != 7) {
            throw new IllegalArgumentException("Stats not for whole week: " +
                    Arrays.toString(stats));
        }
        return new WeeklyStatsV2(description, weekNumber, stats);
    }

}