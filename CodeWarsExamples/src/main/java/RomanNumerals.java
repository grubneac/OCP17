/*
* Write two functions that convert a roman numeral to and from an integer value. Multiple roman numeral values will
* be tested for each function.

Modern Roman numerals are written by expressing each digit separately starting with the left most digit and
* skipping any digit with a value of zero. In Roman numerals:

1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC
2008 is written as 2000=MM, 8=VIII; or MMVIII
1666 uses each Roman symbol in descending order: MDCLXVI.
Input range : 1 <= n < 4000

In this kata 4 should be represented as IV, NOT as IIII (the "watchmaker's four").
* */

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class RomanNumerals {


    public static void main(String[] args) {
//        Examples to roman:
//        2000 -> "MM"
//        1666 -> "MDCLXVI"
//        86 -> "LXXXVI"
//        1 -> "I"

        String res = toRoman(1666);
        if (!res.equals("MDCLXVI")) throw new RuntimeException(res + "!=MDCLXVI /1");
        res = toRoman(2000);
        if (!res.equals("MM")) throw new RuntimeException(res + "!=MM /2");
        res = toRoman(86);
        if (!res.equals("LXXXVI")) throw new RuntimeException(res + "!=LXXXVI /3");
        res = toRoman(1);
        if (!res.equals("I")) throw new RuntimeException(res + "!=I /4");

//        from roman:
//        "MM"      -> 2000
//        "MDCLXVI" -> 1666
//        "LXXXVI"  ->   86
//        "I"       ->    1
        int result = fromRoman("MM");
        if (result != 2000) throw new RuntimeException(result + "!=2000 /5");
        result = fromRoman("MDCLXVI");
        if (result != 1666) throw new RuntimeException(result + "!=1666 /6");
        result = fromRoman("LXXXVI");
        if (result != 86) throw new RuntimeException(result + "!=86 /7");
        result = fromRoman("I");
        if (result != 1) throw new RuntimeException(result + "!=I /8");
        System.out.println("OK");
    }

    //+------+------+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+
//| M    | CM   | D   | CD  | C   | XC  | L   | XL  | X   | IX  | V   | IV  | I   |
//+------+------+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+
//| 1000 | 900  | 500 | 400 | 100 | 90  | 50  | 40  | 10  | 9   | 5   | 4   | 1   |
//+------+------+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+
    private static final Map<Character, Integer> FROM_ROMAN;
    private static final Map<Integer, String> TO_ROMAN;

    static {
        FROM_ROMAN = new HashMap<>(Map.of(
                'M', 1000,
                'D', 500,
                'C', 100,
                'L', 50,
                'X', 10,
                'V', 5,
                'I', 1
        ));
        TO_ROMAN = new HashMap<>(Map.of(
                1000, "M",
                900, "CM",
                500, "D",
                400, "CD",
                100, "C",
                90, "XC",
                50, "L",
                40, "XL",
                10, "X",
                9, "IX"
        ));
        TO_ROMAN.put(5, "V");
        TO_ROMAN.put(4, "IV");
        TO_ROMAN.put(1, "I");
    }

    public static String toRoman(int numberArabic) {
        StringBuilder result = new StringBuilder();
        int orderOfNumber = 1000;
        while (numberArabic > 0) {
            int counts = numberArabic / orderOfNumber;
            result.append(getRomanSimbols(counts, orderOfNumber));
            numberArabic -= counts * orderOfNumber;
            orderOfNumber /= 10;
        }
        return result.toString();
    }

    private static String getRomanSimbols(int countNum, int OrderOfNum) {
        StringBuilder result = new StringBuilder();
        if (countNum == 9) {
            result.append(TO_ROMAN.get(OrderOfNum * countNum));
            countNum = 0;
        } else if (countNum >= 5) {
            result.append(TO_ROMAN.get(OrderOfNum * 5));
            countNum -= 5;
        } else if (countNum == 4) {
            result.append(TO_ROMAN.get(OrderOfNum * 4));
            countNum = 0;
        }
        for (int i = 0; i < countNum; i++) {
            result.append(TO_ROMAN.get(OrderOfNum));
        }

        return result.toString();
    }

    public static int fromRoman(String romanNumeral) {
        char[] romanArray = romanNumeral.toCharArray();
        return IntStream.range(0, romanArray.length)
                .map(i -> (i + 1 < romanArray.length && FROM_ROMAN.get(romanArray[i + 1]) > FROM_ROMAN.get(romanArray[i]))
                        ? -FROM_ROMAN.get(romanArray[i])
                        : FROM_ROMAN.get(romanArray[i])
                ).sum();
    }
}
