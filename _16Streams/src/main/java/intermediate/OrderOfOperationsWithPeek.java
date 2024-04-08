package intermediate;

import util.CD;
import util.Genre;

import java.time.Year;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public final class OrderOfOperationsWithPeek {
    public static void main(String[] args) {

        System.out.println("map() before skip():");
        List<String> cdTitles1 = CD.cdList
                .stream()
                .map(CD::title)
                .peek(t -> System.out.println("After map: " + t))
                .skip(3)
                .peek(t -> System.out.println("After skip: " + t))
                .toList();
        System.out.println(cdTitles1);
        System.out.println();

        System.out.println("skip() before map():");            // Preferable.
        List<String> cdTitles2 = CD.cdList
                .stream()
                .skip(3)
                .peek(cd -> System.out.println("After skip: " + cd))
                .map(CD::title)
                .peek(t -> System.out.println("After map: " + t))
                .toList();
        System.out.println(cdTitles2);

        CD.cdList.stream()                                   // Stream<util.CD>
                .map(CD::year)                              // Stream<Year>
                .distinct()                                 // Stream<Year>
                .mapToInt(Year::getValue)                   // IntStream
                .forEach(System.out::println);              // 2017
        // 2018

        int from = 0, to = 5;
        IntStream.range(from, to)                   // [0, 5)
                .peek(i -> System.out.println("Init " + i))
                .map(i -> to + from - 1 - i)       // Reverse the stream values
                .forEach(System.out::print);       // 43210

        long sixes = IntStream
                .generate(() -> (int) (6.0 * Math.random()) + 1) // [1, 6]
                .limit(2000)                                     // Number of throws.
                .map(i -> i == 6 ? 1 : 0)             // Dice value mapped to 1 or 0.
                .sum();
        System.out.println(sixes);

        int[][] twoDimArray = { {2017, 2018}, {1948, 1949}, {2017, 1948} };
        int[] intArray = Arrays
                .stream(twoDimArray)                     // (1) Stream<int[]>

                .flatMapToInt(Arrays::stream) // (2) mapper: int[] -> IntStream,
                // flattens Stream<IntStream> to IntStream.
                .distinct()
                .toArray();                              // [2017, 2018, 1948, 1949]
        System.out.println(Arrays.toString(intArray));

        // One-to-one
        BiConsumer<CD, Consumer<String>> bcA = (cd, consumer) -> {              // (1)
            if (cd.genre() == Genre.POP) {                                        // (2)
                consumer.accept(String.format("%-15s: %s", cd.title(),              // (3)
                        "*".repeat(cd.noOfTracks())));
            }
        };

        CD.cdList.stream()                                                      // (4)
                .mapMulti(bcA)                                                // (5)
                .forEach(System.out::println);

        //-----------------------------------------------

        // One-to-many
        List<CD> cdList1 = List.of(CD.cd0, CD.cd1, CD.cd1);
        List<CD> cdList2 = List.of(CD.cd0, CD.cd1);
        BiConsumer<List<CD>, Consumer<String>> bcB = (lst, consumer) -> {       // (1)
            for (CD cd : lst) {
                consumer.accept(cd.title());
            }
        };
        List<String> listOfCDTitles = Stream.of(cdList1, cdList2) // (2) Stream<List<CD>>
                .mapMulti(bcB)                                        // (3)
                .distinct()
                .toList();
        System.out.println(listOfCDTitles);                       // [Java Jive, Java Jam]
    }
}
