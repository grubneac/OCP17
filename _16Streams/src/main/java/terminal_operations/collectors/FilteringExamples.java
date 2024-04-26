package terminal_operations.collectors;

import util.CD;

import java.time.Year;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilteringExamples {
    public static void main(String[] args) {
        // Filtering downstream from grouping.
        Map<Integer, List<CD>> grpByTracksFilterByPopCD = CD.cdList.stream()
                .collect(Collectors.groupingBy(CD::noOfTracks,                        // (1)
                        Collectors.filtering(CD::isPop, Collectors.toList())));  // (2)
        System.out.println(grpByTracksFilterByPopCD);

        // Filtering before grouping.
        Map<Integer, List<CD>> filterByPopCDGrpByTracks = CD.cdList.stream()
                .filter(CD::isPop)                                                     // (1)
                .collect(Collectors.groupingBy(CD::noOfTracks, Collectors.toList()));
        System.out.println(filterByPopCDGrpByTracks);

        // Filtering downstream from partitioning.
        Map<Boolean, List<CD>> partbyPopCDsFilterByYear = CD.cdList.stream()     // (1)
                .collect(Collectors.partitioningBy(CD::isPop,
                        Collectors.filtering(cd -> cd.year().equals(Year.of(2018)),
                                Collectors.toList()))); // (2)
        System.out.println(partbyPopCDsFilterByYear);

        // Filtering before partitioning.
        Map<Boolean, List<CD>> filterByYearPartbyPopCDs = CD.cdList.stream()     // (2)
                .filter(cd -> cd.year().equals(Year.of(2018)))
                .collect(Collectors.partitioningBy(CD::isPop, Collectors.toList()));
        System.out.println(filterByYearPartbyPopCDs);
    }
}
