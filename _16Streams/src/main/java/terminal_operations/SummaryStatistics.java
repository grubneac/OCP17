package terminal_operations;

import util.CD;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

public class SummaryStatistics {
    public static void main(String[] args) {
        IntSummaryStatistics stats1 = List.of(CD.cd0, CD.cd1)
                .stream()
                .mapToInt(CD::noOfTracks)
                .summaryStatistics();
        System.out.println("Stats: " + stats1);
        System.out.println("Count="   + stats1.getCount());        // Count=2
        System.out.println("Sum="     + stats1.getSum());          // Sum=14
        System.out.println("Min="     + stats1.getMin());          // Min=6
        System.out.println("Max="     + stats1.getMax());          // Max=8
        System.out.println("Average=" + stats1.getAverage());      // Average=7.0

        stats1.accept(CD.cd2.noOfTracks());     // Add the value 10.
        System.out.println(stats1);
        //IntSummaryStatistics{count=3, sum=24, min=6, average=8.000000, max=10}

        IntSummaryStatistics stats2 = List.of(CD.cd3, CD.cd4)
                .stream()
                .mapToInt(CD::noOfTracks)
                .summaryStatistics();
        System.out.println(stats2);
        //IntSummaryStatistics{count=2, sum=18, min=8, average=9.000000, max=10}

        stats1.combine(stats2);                 // Combine stats2 with stats1.
        System.out.println(stats1);
        //IntSummaryStatistics{count=5, sum=42, min=6, average=8.400000, max=10}

        IntSummaryStatistics emptyStats = IntStream.empty().summaryStatistics();
        System.out.println(emptyStats);
        //IntSummaryStatistics{count=0, sum=0, min=2147483647, average=0.000000,
        //max=-2147483648}
    }
}
