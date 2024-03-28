import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InitStreamExample {
    public static void main(String[] args) {
        // From an array of CDs.
        Stream<CD> cdStream3 = Stream.of(CD.cdArray);                 // (1)
        Stream<CD> cdStream4 = Arrays.stream(CD.cdArray);             // (2)

// From an array of Integer.
        Integer[] integerArray = {2017, 2018, 2019};                  // (3)
        Stream<Integer> integerStream2 = Stream.of(integerArray);     // (4)
        Stream<Integer> integerStream3 = Arrays.stream(integerArray); // (5)

// From an array of int.
        int[] intArray = {2017, 2018, 2019};                          // (6)
        Stream<int[]> intArrayStream = Stream.of(intArray);           // (7) Size is 1.
        IntStream intStream2 = IntStream.of(intArray);                // (8) Size is 3.
        IntStream intStream3 = Arrays.stream(intArray);               // (9) Size is 3.

        System.out.println("\n--------------Generate by generate---------------------");
        IntSupplier supplier = () -> (int) (6.0 * Math.random()) + 1;  // (1)
        IntStream.generate(supplier)           // (2)
                .limit(5)                                            // (3)
                .forEach(i -> System.out.print(i + " "));            // (4) 2 4 5 2 6

        System.out.println("\n--------------Generate by iterate---------------------");
        IntUnaryOperator uop = n -> n + 2;                // (1)
        IntStream.iterate(1, uop)    // (2)
                .limit(5)
                .forEach(i -> System.out.print(i + " "));  // 1 3 5 7 9

        System.out.println("\n--------------Generate by iterate---------------------");
        Stream.iterate("ba", b -> b + "na")
                .limit(5)
                .forEach(System.out::println);

        System.out.println("\n--------------Concatenating Streams unordered---------------------");
        Set<String> strSet1                                                         // (1)
                = Set.of("All", " objects", " are", " equal");
        Set<String> strSet2                                                         // (2)
                = Set.of(" but", " some", " are", " more", " equal", " than", " others.");
        Stream<String> unorderedStream1 = strSet1.stream();                         // (3)
        Stream<String> unorderedStream2 = strSet2.stream();                         // (4)
        Stream.concat(unorderedStream1, unorderedStream2)                           // (5)
                .forEachOrdered(System.out::print);                                      // (6)
        // objectsAll equal are some are others. than equal more but

        System.out.println("\n--------------Concatenating Streams ordered---------------------");
        Stream<String> orderedStream1 = Stream.of("All", " objects",                // (1)
                " are", " equal");
        Stream<String> orderedStream2 = Stream.of(" but", " some", " are", " more", // (2)
                " equal", " than", " others.");
        Stream.concat(orderedStream1, orderedStream2)                               // (3)
                .forEachOrdered(System.out::print);                                   // (4)
        // All objects are equal but some are more equal than others.

        System.out.println("\n--------------Parallel Streams ---------------------");
        Stream<String> pStream1 = strSet1.stream().parallel();                // (1)
        System.out.println("pStream1 is parallel: " + pStream1.isParallel()); // (2) true
        Stream<String> rStream = Stream.concat(pStream1, strSet2.stream());   // (3)
        System.out.println("rStream is parallel: " + pStream1.isParallel());  // (4) true
        rStream.forEachOrdered(System.out::print);                            // (5)
// objectsAll equal are some are others. than equal more but

        System.out.println("\n--------------Add to list and check stream ---------------------");
        List<CD> listOfCDS = new ArrayList<>(List.of(CD.cd0, CD.cd1));       // (1)
        Stream<CD> cdStream = listOfCDS.stream();                            // (2)
        listOfCDS.add(CD.cd2);                                               // (3)
        System.out.println(cdStream.count());                                // (4) 3
// System.out.println(cdStream.count());             // (5) IllegalStateException

        System.out.println("\n--------------Add to MAP ---------------------");
        Map<Integer, String> dataMap = new HashMap<>();                     // (1)
        dataMap.put(1, "en");
        dataMap.put(2, "to");
        dataMap.put(3, "tre");
        dataMap.put(4, "fire");
        long numOfEntries = dataMap
                .entrySet()                                                     // (2)

                .stream()                                                       // (3)
                .count();                                                       // (4) 4
        System.out.println(numOfEntries);

        System.out.println("\n--------------Streams from Arrays(range) ---------------------");
        Stream<CD> cdStream2 = Arrays.stream(CD.cdArray, 1, 4);          // (1)
        long noOfElements = cdStream2.count();                        // (2) 3
        System.out.println(noOfElements);

        System.out.println("\n--------------Building a Numeric Stream with a Range ---------------------");
        IntStream.range(0, CD.cdArray.length)                                   // (1)
                .forEach(i -> System.out.println(CD.cdArray[CD.cdArray.length - 1 - i]));

        int divisor = 3;
        int start = 2000, end = 3000;
        long divisibles = IntStream
                .rangeClosed(start, end)                                            // (1)
                .filter(number -> number % divisor == 0)                            // (2)
                .count();                                                           // (3)
        System.out.println(divisibles);

        System.out.println("\n--------------Multiplication tables ---------------------");
        IntStream.rangeClosed(1, 10)                                 // Outer range.
                .forEach(i -> IntStream.rangeClosed(1, 10)          // Inner range.
                        .forEach(j -> System.out.printf("%2d * %2d = %2d%n",
                                i, j, i * j)));

        System.out.println("\n--------------Numeric Streams Using the Random Class---------------------");
        Random rng = new Random();                        // (1)
        IntStream iStream = rng.ints();                   // (2) Unlimited, any int value
        int[] intArray1 = iStream.limit(3).toArray();      // Limits size to 3
        System.out.println(Arrays.toString(intArray1));
//[-1170441471, 1070948914, 264046613]
        intArray1 = rng.ints(3).toArray();                 // (3) Size 3, any int value//[1011448344, -974832344, 816809715
        System.out.println(Arrays.toString(intArray1));

        DoubleStream dStream = rng.doubles(3);            // (6) Size 3, [0.0, 1.0)
        double[] dArray = dStream.toArray();
//[0.9333794789872794, 0.7037326827186609, 0.2839257522887708]

        System.out.println("\n--------------Streams from a CharSequence---------------------");
        String strSource = "banananana";
        IntStream iStream1 = strSource.chars();                   // (1)
        iStream1.forEach(i -> System.out.print(i + " "));         // Prints ints.
// 98 97 110 97 110 97 110 97 110 97
        System.out.println("");
        strSource.chars()
                .mapToObj(i -> (char) i)                         // (2) Stream<Character>
                .forEach(System.out::print);                    // Prints chars.
// banananana

        System.out.println("\n--------------Streams from a String---------------------");
        String inputLines = "Wise men learn from their mistakes.\n"                 // (1)
                + "But wiser men learn from the mistakes of others.\n"
                + "And fools just carry on.";
        Stream<String> lStream = inputLines.lines();                                // (2)
        lStream.filter(l -> l.contains("mistakes")).forEach(System.out::println);   // (3)

        System.out.println("\n--------------Streams from a BufferedReader---------------------");
        String path = InitStreamExample.class.getClassLoader().getResource("CD_Data.txt").getPath();
        System.out.println(path);
        try (FileReader fReader = new FileReader(path);         // (1)
             BufferedReader bReader = new BufferedReader(fReader);       // (2)
             Stream<String> lStream1 = bReader.lines();// (3)
        ) {
            System.out.println("Number of lines: " + lStream1.count());      // (4) 13
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n--------------Streams from Factory Methods in the Files Class---------------------");
        Path path1 = Paths.get(InitStreamExample.class.getClassLoader()
                .getResource("CD_Data.txt").getPath().substring(1));                             // (1)
        System.out.println(path1);
        try (Stream<String> lStream3 = Files.lines(path1)) {                // (2)
            System.out.println("Number of lines: " + lStream3.count());      // (3) 13
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
