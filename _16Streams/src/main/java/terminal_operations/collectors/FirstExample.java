package terminal_operations.collectors;

import util.CD;

import java.time.Year;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstExample {
    public static void main(String[] args) {
//        List<String> cdTitles1 = CD.cdList.stream() // Stream<CD>
        ArrayList<String> cdTitles1 = CD.cdList.stream() // Stream<CD>
                .map(CD::title)                              // Stream<String>
//                .toList();
                .collect(Collectors.toCollection(ArrayList::new));
//[Java Jive, Java Jam, Lambda Dancing, Keep on Erasing, Hot Generics]
        cdTitles1.add("Something");
        System.out.println(cdTitles1);

        List<String> cdTitles3 = CD.cdList.stream()      // Stream<CD>
                .map(CD::title)                              // Stream<String>
                .collect(Collectors.toList());
//[Java Jive, Java Jam, Lambda Dancing, Keep on Erasing, Hot Generics]
        cdTitles3.add("Java Jingles");                      // OK
        System.out.println(cdTitles3);

        Set<String> cdTitles2 = CD.cdList.stream()       // Stream<CD>
                .map(CD::title)                              // Stream<String>
                .collect(Collectors.toSet());
//[Hot Generics, Java Jive, Lambda Dancing, Keep on Erasing, Java Jam]
        cdTitles2.add("wfsdsdfdsff");
        System.out.println(cdTitles2);

        Map<CD, Year> mapCDToYear = CD.cdList.stream()
                .collect(Collectors.toMap(Function.identity(), CD::year)); // Map<CD, Year>
        System.out.println(mapCDToYear);

        List<CD> dupList = List.of(CD.cd0, CD.cd1, CD.cd2, CD.cd0, CD.cd1);
        Map<String, Year> mapTitleToYear1 = dupList.stream()
                .collect(Collectors.toMap(CD::title, CD::year, (y1, y2)-> y1));       // (1)
        System.out.println(mapTitleToYear1);

        TreeMap<Year, String> mapYearToLongestTitle = CD.cdList.stream()
                .collect(Collectors.toMap(CD::year, CD::title,
                        BinaryOperator.maxBy(Comparator.naturalOrder()),
                        TreeMap::new));
//{2017=Java Jive, 2018=Lambda Dancing}
        System.out.println(mapYearToLongestTitle);
    }
}
