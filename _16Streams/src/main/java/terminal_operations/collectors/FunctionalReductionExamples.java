package terminal_operations.collectors;

import util.CD;
import util.Genre;

import java.time.Year;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class FunctionalReductionExamples {
    public static void main(String[] args) {
        Long numOfJazzCds = CD.cdList.stream().filter(CD::isJazz)
                .count();                  // (1) Standard
        System.out.println(numOfJazzCds);                    // 3
        Long numOfJazzCds1 = CD.cdList.stream().filter(CD::isJazz)
                .collect(Collectors.counting());                  // (1) Standalone collector
        System.out.println(numOfJazzCds1);                    // 3

        Map<Genre, Long> grpByGenre = CD.cdList.stream()
                .collect(Collectors.groupingBy(
                        CD::genre,
                        Collectors.counting()));             // (2) Downstream collector
        System.out.println(grpByGenre);                       // {POP=2, JAZZ=3}
        System.out.println(grpByGenre.get(Genre.POP));       // 3

        Comparator<CD> natCmp = Comparator.naturalOrder(); // (1)

        Optional<CD> maxCD = CD.cdList.stream()
                .collect(Collectors.maxBy(natCmp));            // (2) Standalone collector
        System.out.println("Max CD: "
                + maxCD.map(CD::title).orElse("No CD."));      // Max CD: Java JiveI didn't

        // Group CDs by musical genre, and max CD in each group.
        Map<Genre, Optional<CD>> grpByGenre1 = CD.cdList.stream()
                .collect(Collectors.groupingBy(
                        CD::genre,
                        Collectors.maxBy(natCmp)));       // (3) Downstream collector
        System.out.println(grpByGenre1);
//{JAZZ=Optional[<Jaav, "Java Jam", 6, 2017, JAZZ>],
// POP=Optional[<Jaav, "Java Jive", 8, 2017, POP>]}

        System.out.println("Title of max Jazz CD: "
                + grpByGenre1.get(Genre.JAZZ)
                .map(CD::title)
                .orElse("No CD."));       // Title of max Jazz CD: Java Jam

        System.out.println("--------Summing------------");
        Integer sumTracks = CD.cdList.stream()
                .collect(Collectors.summingInt(CD::noOfTracks));   // (1) Standalone collector
        System.out.println(sumTracks);                         // 42

        Map<Genre, Integer> grpByGenre2 = CD.cdList.stream()
                .collect(Collectors.groupingBy(
                        CD::genre,
                        Collectors.summingInt(CD::noOfTracks)));    // (2) Downstream collector
        System.out.println(grpByGenre2);                      // {POP=18, JAZZ=24}
        System.out.println(grpByGenre2.get(Genre.JAZZ));      // 24

        System.out.println("--------Averaging------------");
        Double avgNoOfTracks1 = CD.cdList.stream()
                .collect(Collectors
                        .averagingInt(CD::noOfTracks));             // (1) Standalone collector
        System.out.println(avgNoOfTracks1);                 // 8.4
        Map<Genre, Double> grpByGenre3 = CD.cdList.stream()
                .collect(Collectors.groupingBy(
                        CD::genre,
                        Collectors.averagingInt(CD::noOfTracks)      // (2) Downstream collector
                ));
        System.out.println(grpByGenre3);                     // {POP=9.0, JAZZ=8.0}
        System.out.println(grpByGenre3.get(Genre.JAZZ));     // 8.0

        System.out.println("--------Summarizing------------");
        IntSummaryStatistics stats1 = CD.cdList.stream()
                .collect(
                        Collectors.summarizingInt(CD::noOfTracks)      // (1) Standalone collector
                );
        System.out.println(stats1);
// IntSummaryStatistics{count=5, sum=42, min=6, average=8.400000, max=10}
        Map<Genre, IntSummaryStatistics> grpByGenre4 = CD.cdList.stream()
                .collect(Collectors.groupingBy(
                        CD::genre,
                        Collectors.summarizingInt(CD::noOfTracks)));    // (2) Downstream collector
        System.out.println(grpByGenre4);
//{POP=IntSummaryStatistics{count=2, sum=18, min=8, average=9.000000, max=10},
// JAZZ=IntSummaryStatistics{count=3, sum=24, min=6, average=8.000000, max=10}}

        System.out.println(grpByGenre4.get(Genre.JAZZ));   // Summary stats for Jazz CDs.
// IntSummaryStatistics{count=3, sum=24, min=6, average=8.000000, max=10}

        IntSummaryStatistics stats2 = CD.cdList.stream()
                .mapToInt(CD::noOfTracks)
                .summaryStatistics();                         // (3)
        System.out.println(stats2);
// IntSummaryStatistics{count=5, sum=42, min=6, average=8.400000, max=10}

        System.out.println("--------Reducing------------");
        // Comparator to compare CDs by title.
        Comparator<CD> cmpByTitle = Comparator.comparing(CD::title);        // (1)
// Comparator to compare strings by their length.
        Comparator<String> byLength = Comparator.comparing(String::length); // (2)

        Optional<String> longestTitle1 = CD.cdList.stream()
                .map(CD::title)
                .collect(Collectors.reducing(
                        BinaryOperator.maxBy(byLength)));            // (3) Standalone collector
        System.out.println(longestTitle1.orElse("No title"));// Keep on Erasing

        Optional<String> longestTitle2 = CD.cdList.stream()  // Stream<CD>
                .map(CD::title)                                  // Stream<String>
                .reduce(BinaryOperator.maxBy(byLength));         // (4) Stream.reduce(bop)
        System.out.println(longestTitle2.orElse("No title"));// Keep on Erasing

        Map<Year, Optional<CD>> cdWithMaxTitleByYear = CD.cdList.stream()
                .collect(Collectors.groupingBy(
                        CD::year,
                        Collectors.reducing(                        // (5) Downstream collector
                                BinaryOperator.maxBy(cmpByTitle))
                ));
        System.out.println(cdWithMaxTitleByYear);
// {2017=Optional[<Jaav, "Java Jive", 8, 2017, POP>],
//  2018=Optional[<Funkies, "Lambda Dancing", 10, 2018, POP>]}
        System.out.println(cdWithMaxTitleByYear.get(Year.of(2018))
                .map(CD::title).orElse("No title")); // Lambda Dancing

        Map<Year, String> longestTitleByYear = CD.cdList.stream()
                .collect(Collectors.groupingBy(
                        CD::year,
                        Collectors.reducing("", CD::title,          // (6) Downstream collector
                                BinaryOperator.maxBy(byLength))
                ));
        System.out.println(longestTitleByYear);  // {2017=Java Jive, 2018=Keep on Erasing}
        System.out.println(longestTitleByYear.get(Year.of(2018)));      // Keep on Erasing

        Map<Year, Optional<String>> longestTitleByYear2 = CD.cdList.stream()
                .collect(Collectors.groupingBy(
                        CD::year,
                        Collectors.mapping(CD::title,               // (7) Downstream collector
                                Collectors.maxBy(byLength))
                ));
        System.out.println(longestTitleByYear2);
// {2017=Optional[Java Jive], 2018=Optional[Keep on Erasing]}
        System.out.println(longestTitleByYear2.get(Year.of(2018))
                .orElse("No title."));        // Keep on Erasing

        Map<Year, Integer> noOfTracksByYear = CD.cdList.stream()
                .collect(Collectors.groupingBy(
                        CD::year,
                        Collectors.reducing(                        // (8) Downstream collector
                                0, CD::noOfTracks, Integer::sum)));
        System.out.println(noOfTracksByYear);                   // {2017=14, 2018=28}
        System.out.println(noOfTracksByYear.get(Year.of(2018)));// 28

        Map<Year, Integer> noOfTracksByYear2 = CD.cdList.stream()
                .collect(Collectors.groupingBy(
                        CD::year,
                        Collectors.summingInt(CD::noOfTracks)));    // (9) Special case collector
        System.out.println(noOfTracksByYear2);
    }
}
