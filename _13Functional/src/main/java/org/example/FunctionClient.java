package org.example;

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

public class FunctionClient {
    public static void main(String[] args) {

        // Examples of Function<T,R>:
        Function<Integer, Boolean> boolExpr = i -> 50 <= i && i < 100;
        System.out.println("Boolean expression is: " + boolExpr.apply(99));
        // Boolean expression is: true

        Function<Integer, Double> milesToKms = miles -> 1.6 * miles;
        System.out.printf("%dmi = %.2fkm%n", 24, milesToKms.apply(24));
        // 24mi = 38.40km

        // Create a list of StringBuilders from an array of Strings.
        String[] strArray = {"One", "Two", "Three", "Four"};
        List<StringBuilder> sbList = listBuilder(strArray, s -> new StringBuilder(s));
        System.out.println("Build StringBuilder list: " + sbList);
        // Build StringBuilder list: [One, Two, Three, Four]

        // Create a list of Integers from an array of Strings.
        List<Integer> intList = listBuilder(strArray, s -> s.length());
        System.out.println("Build Integer list: " + intList);
        // Build Integer list: [3, 3, 5, 4]

        /* Composing unary functions. */
        Function<String, String> f = s -> s + "-One";    // (1)
        Function<String, String> g = s -> s + "-Two";    // (2)

        // Using compose() and andThen() methods.
        System.out.println(f.compose(g).apply("Three")); // (3) Three-Two-One
        System.out.println(g.andThen(f).apply("Three")); // (4) Three-Two-One
        System.out.println(f.apply(g.apply("Three")));   // (5) Three-Two-One
        System.out.println();

        System.out.println(f.andThen(g).apply("Three")); // (6) Three-One-Two
        System.out.println(g.compose(f).apply("Three")); // (7) Three-One-Two
        System.out.println(g.apply(f.apply("Three")));   // (8) Three-One-Two
        System.out.println();

        // Examples of primitive unary functions.
        IntFunction<String> intToStr = i -> Integer.toString(i);
        System.out.println(intToStr.apply(2021));        // 2021
        ToIntFunction<String> strToInt = str -> Integer.parseInt(str);
        System.out.println(strToInt.applyAsInt("2021")); // 2021

        IntToDoubleFunction celsiusToFahrenheit = celsius -> 1.8 * celsius + 32.0;
        System.out.printf("%d Celsius = %.1f Fahrenheit%n",
                37, celsiusToFahrenheit.applyAsDouble(37));
        // 37 Celsius = 98.6 Fahrenheit

        BiFunction<String, String, String> concatKeyVal = (key, val) -> key.concat(val);
        Map<String, String> map = new HashMap<>() {{
            put("Dick", "silver");
            put("Harriet", "platinum");
            put("Tom", "gold");
        }};
// {Dick=silver, Harriet=platinum, Tom=gold}
        map.replaceAll(concatKeyVal);
// {Dick=Dicksilver, Harriet=Harrietplatinum, Tom=Tomgold}
        System.out.println(map);


        BiFunction<String, String, String> concatStr = (s1, s2) -> s1 + s2;
        Function<String, String> postfix1 = s -> s + "nana";
        Function<String, String> postfix2 = s -> s + "s!";
        System.out.println(concatStr.andThen(postfix1).andThen(postfix2)
                .apply("I am going", " ba"));         // I am going bananas!

//-----------------------------------------------------------------
        UnaryOperator<Double> area = r -> Math.PI * r * r;
        System.out.printf("Area of circle, radius %.2f: %.2f%n", 10.0, area.apply(10.0));
        // Area of circle, radius 10.00: 314.16

        UnaryOperator<Double> milesToKms2 = miles -> 1.6 * miles;
        System.out.printf("%.2fmi = %.2fkm%n", 24.0, milesToKms2.apply(24.0));
        // 24.00mi = 38.40km

        List<String> team = Arrays.asList("Tom", "Dick", "Harriet");
        UnaryOperator<String> toUpper = str -> str.toUpperCase();
        team.replaceAll(toUpper);     // [TOM, DICK, HARRIET]
        System.out.println(team);

        UnaryOperator<String> f1 = s -> s + "-One";
        UnaryOperator<String> g1 = s -> s + "-Two";
        System.out.println(f1.compose(g1).apply("Three")); // Three-Two-One
        System.out.println(f1.andThen(g1).apply("Three")); // Three-One-Two

        DoubleUnaryOperator celsiusToFahrenheit1 = celsius -> 1.8 * celsius + 32.0;
        System.out.printf("%.1f Celsius = %.1f Fahrenheit%n",
                25.0, celsiusToFahrenheit1.applyAsDouble(25.0));
        // 25.0 Celsius = 77.0 Fahrenheit

        DoubleUnaryOperator kms = miles -> 1.6 * miles;
        System.out.printf("%.2fmi = %.2fkm%n", 25.0, kms.applyAsDouble(25.0));
        // 25.00mi = 40.00km

        IntUnaryOperator incrBy1 = i -> i + 1;
        IntUnaryOperator multBy2 = i -> i * 2;
        System.out.println(incrBy1.compose(multBy2).applyAsInt(4)); // 9
        System.out.println(incrBy1.andThen(multBy2).applyAsInt(4)); // 10

        BinaryOperator<String> concatTwo = (s1, s2) -> s1 + s2;
        UnaryOperator<String> postfix11 = s -> s + "nana";
        UnaryOperator<String> postfix22 = s -> s + "s!";
        System.out.println(concatTwo.andThen(postfix11).andThen(postfix22)
                .apply("I am going", " ba"));     // I am going bananas!

        String maxStr = BinaryOperator.maxBy(String.CASE_INSENSITIVE_ORDER)
                .apply("aha", "Madonna");             // Madonna
        System.out.println(maxStr);
        String minStr = BinaryOperator.minBy(String.CASE_INSENSITIVE_ORDER)
                .apply("aha", "Madonna");             // aha
        System.out.println(minStr);

        StringBuilder sb = new StringBuilder("!em esreveR");         // (1)
// () -> StringBuilder
        Supplier<StringBuilder> sbReverserLE = () -> sb.reverse();   // (2a)
        Supplier<StringBuilder> sbReverserMR = sb::reverse;          // (2b)
        System.out.println(sb);                      // (3)
        System.out.println(sbReverserLE.get());                      // (3)
        System.out.println(sbReverserMR.get());                      // (3)
// Calls sb.reverse() that returns the StringBuilder with character sequence
// "Reverse me!".

        String str = "Java Jive";                                             // (4)
// (String, String) -> String
        BinaryOperator<String> replaceOpLE = (s1, s2) -> str.replace(s1, s2); // (5a)
        BinaryOperator<String> replaceOpMR = str::replace;                    // (5b)
        System.out.println(replaceOpMR.apply("Jive", "Jam"));                 // (6)
// Calls str.replace("Jive", "Jam") that returns the string "Java Jam".

        // String -> int
        ToIntFunction<String> lenLE = s -> s.length();
        ToIntFunction<String> lenMR = String::length;                  // (1)
        System.out.println(lenMR.applyAsInt("Java"));                  // 4
// Calls "Java".length() that returns the int value 4.

        // (List<String>, String) -> boolean
        BiPredicate<List<String>, String> containsLE
                = (list, element) -> list.contains(element);

        List<String> words = List.of("jghdfghdjfghj", "BOB");
        BiPredicate<List<String>, String> containsMR1 = List::contains;          // (3)
        BiPredicate<List<String>, String> containsMR2 = List<String>::contains;  // (4)
        System.out.println(containsMR2.test(words, "BOB"));  // words is a List<String>.
// Calls words.contains("BOB") that returns a boolean value.

        // () -> StringBuilder
        Supplier<StringBuilder> sbLE = () -> new StringBuilder("StringBuilder instance");
        Function<String, StringBuilder> sbCR = StringBuilder::new;               // (1)
        System.out.println(sbLE.get());
        System.out.println(sbCR.apply("StringBuilder instance from reference method"));
// Calls new StringBuilder() to create an empty StringBuilder instance.

        // (String, String) -> Locale
        BiFunction<String, String, Locale> locConsLE
                = (language, country) -> new Locale(language, country);
        BiFunction<String, String, Locale> locConsCR = Locale::new;
        System.out.println(locConsCR.apply("en","US"));                  // en_US
// Calls new Locale("en", "US") to create a Locale instance with the specified
// parameter values.
        // int -> int[]
        IntFunction<int[]> intArrConsLE = n -> new int[n];
        IntFunction<int[]> intArrConsCR = int[]::new;                              // (1)
        int[] intArr = intArrConsCR.apply(4);                                      // (2)
        System.out.println("intArr.length: " + intArr.length);
// Creates an int array of length 4.

        // (int, int) -> int[][]
        BiFunction<Integer, Integer, int[][]> twoDimArrConsLE1 = (n, m) -> new int[n][m];
// BiFunction<Integer, Integer, int[][]> twoDimArrConsCR1
//      = int[][]:: new;                               // (3) Compile-time error!

        // int -> int[][]
        IntFunction<int[][]> twoDimArrConsLE = n -> new int[n][];
        IntFunction<int[][]> twoDimArrConsCR = int[][]::new;            // (4)
        int[][] twoDimIntArr1 = twoDimArrConsCR.apply(3);               // (5)
// [null, null, null]
        for (int i = 0; i < twoDimIntArr1.length; ++i)
            twoDimIntArr1[i] = intArrConsCR.apply(i+1);                   // (6) Calls (1).
        Stream.of(twoDimIntArr1).map(Arrays::toString).forEach(System.out::println);
// [[0], [0, 0], [0, 0, 0]]

        // n -> String[]
        String[] strArrLE = createArray(5, n -> new String[n]); // (9)
        String[] strArrACE = createArray(5, String[]::new);     // (10)
        System.out.println(strArrACE.length);

        int ii = 10;
        IntUnaryOperator iFunc1 = ii % 2 == 0 ? i -> i * 2 : j -> j + 1;   // int -> int
        iFunc1.applyAsInt(4);                                              // 8
//IntUnaryOperator iFunc2 = ii % 2 == 0 ? i -> i * 2
//                          : s -> Integer.parseInt(s);   // Compile-time error!
        System.out.println(((IntUnaryOperator) i -> i * 2).applyAsInt(10));        // 20
        System.out.println(((DoubleUnaryOperator) i -> i * 2).applyAsDouble(10.0));// 20.0


    }

    /**
     * Create a list from an array by applying a Function to each array element.
     * @param arrayT     Array to use for elements
     * @param func       Function to apply to each array element
     * @return           List that is created
     */
    public static <T, R> List<R> listBuilder(T[] arrayT, Function<T, R> func) {
        List<R> listR = new ArrayList<>();
        for (T t : arrayT) {
            listR.add(func.apply(t));
        }
        return listR;
    }

    public static <A> A[] createArray(int length, IntFunction<A[]> creator) {
//A[] arr = new A[length];       // (8) Cannot create generic array!
        return creator.apply(length);  // Lambda expression or

        // array constructor reference executed.
    }
}
