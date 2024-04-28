package terminal_operations.collectors;

import util.CD;

import java.time.Year;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MappingExamples {
    public static void main(String[] args) {
        Map<Year, Set<String>> titlesByYearInSet = CD.cdList.stream()
                .collect(Collectors.groupingBy(
                        CD::year,
                        Collectors.mapping(                           // (1)
                                CD::title,                                // Mapper
                                Collectors.toSet())));                    // Downstream collector
        System.out.println(titlesByYearInSet);
// {2017=[Java Jive, Java Jam],
//  2018=[Hot Generics, Lambda Dancing, Keep on Erasing]}

        Map<Year, String> joinTitlesByYear = CD.cdList.stream()
                .collect(Collectors.groupingBy(
                        CD::year,
                        Collectors.mapping(                           // (2)
                                CD::title,
                                Collectors.joining(":"))));
        System.out.println(joinTitlesByYear);
// {2017=Java Jive:Java Jam,
//  2018=Lambda Dancing:Keep on Erasing:Hot Generics}

        System.out.println("-----Flat Mapping Adapter for Downstream Collectors-----");
        // Given lists of CDs:
        List<CD> cdListA = List.of(CD.cd0, CD.cd1);
        List<CD> cdListB = List.of(CD.cd0, CD.cd1, CD.cd1);

// list of list To one list:
        List<CD> collect = Stream.of(cdListA, cdListB)                         // (1) Stream<List<CD>>
                .collect(Collectors.flatMapping(List::stream, // (2) Flatten to Stream<CD>
                        Collectors.toList()));// (4) Set<String>
        System.out.println(collect);

// Find unique CD titles in the given lists:
        Set<String> set =
                Stream.of(cdListA, cdListB)                         // (1) Stream<List<CD>>
                        .collect(Collectors.flatMapping(List::stream, // (2) Flatten to Stream<CD>
                                Collectors.mapping(CD::title,            // (3) Stream<String>
                                        Collectors.toSet())));               // (4) Set<String>
        System.out.println(set);
    }
}
