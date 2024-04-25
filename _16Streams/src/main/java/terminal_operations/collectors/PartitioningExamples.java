package terminal_operations.collectors;

import util.CD;

import java.time.Year;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningExamples {
    public static void main(String[] args) {
        Map<Boolean, List<CD>> map1 = CD.cdList.stream()
                .collect(Collectors.partitioningBy(CD::isPop)); // (1)
        System.out.println(map1.get(true));
        System.out.println(map1.get(false));
        System.out.println("---------------------------");

        Map<Boolean, List<CD>> map2 = CD.cdList.stream()
                .collect(Collectors.partitioningBy(CD::isPop, Collectors.toList())); // (2)
        System.out.println(map2.get(true));
        System.out.println(map2.get(false));
        System.out.println("---------------------------");
        Map<Boolean, Long> map3 = CD.cdList.stream()
                .collect(Collectors.partitioningBy(CD::isPop, Collectors.counting()));
//{false=3, true=2}
        System.out.println(map3);
        System.out.println("-----------Multilevel Partitioning----------------");
        Map<Boolean, Map<Year, List<CD>>> map11 = CD.cdList.stream()
                .collect(Collectors.partitioningBy(CD::isPop,                     // (1)
                        Collectors.groupingBy(CD::year)));
        System.out.println(map11);
    }
}
