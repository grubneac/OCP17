package terminal_operations.collectors;

import util.CD;
import util.Genre;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class GroupingExamples {
    public static void main(String[] args) {
        Map<Integer, List<CD>> map21 = CD.cdList.stream()
                .collect(Collectors.groupingBy(CD::noOfTracks));  // (1)
        System.out.println(map21);

        Map<Integer, List<CD>> map22 = CD.cdList.stream()
                .collect(Collectors.groupingBy(CD::noOfTracks, Collectors.toList()));  // (2)
        System.out.println(map22);

        TreeMap<Integer, List<CD>> map33 = CD.cdList.stream()
                .collect(Collectors.groupingBy(CD::noOfTracks,                         // (3)
                        TreeMap::new,
                        Collectors.toList()));
        System.out.println(map33);

        Map<Integer, Set<CD>> map44 = CD.cdList.stream()
                .collect(Collectors.groupingBy(CD::noOfTracks, Collectors.toSet()));   // (4)
        System.out.println(map44);

        Map<Integer, Long> map55 = CD.cdList.stream()
                .collect(Collectors.groupingBy(CD::noOfTracks, Collectors.counting()));
//{6=1, 8=2, 10=2}
        System.out.println(map55);

        System.out.println("----------Multilevel Grouping-----------");

        Map<Integer, Map<Genre, List<CD>>> twoLevelGrp = CD.cdList.stream()
                .collect(Collectors.groupingBy(CD::noOfTracks,             // (1)
                        Collectors.groupingBy(CD::genre)));           // (2)
        System.out.println(twoLevelGrp);

        Map<Integer, Map<Genre, Long>> twoLevelGrp2 = CD.cdList.stream()
                .collect(Collectors.groupingBy(CD::noOfTracks,
                        Collectors.groupingBy(CD::genre,
                                Collectors.counting())));   // (3)
        System.out.println(twoLevelGrp2);

        System.out.println("----------Parallel steream------------");
        ConcurrentMap<Integer, Long> map66 = CD.cdList
                .parallelStream()
                .collect(Collectors.groupingByConcurrent(CD::noOfTracks,
                        Collectors.counting()));
//{6=1, 8=2, 10=2}
        System.out.println(map66);
    }
}
