import java.util.Arrays;

import static java.lang.System.out;

public class ArraysExamples {
    public static void main(String[] args) {
        String[] fruitBasketA = { "oranges", "apples", "plums", "kiwi" };
        String[] fruitBasketB = { "oranges", "apples", "plums", "kiwi" };
        String[] fruitBasketC = { "oranges", "apples", "kiwi", "plums" };
        String[] fruitBasketE = { "oranges", "apples" };
        out.println("Equals: " + Arrays.equals(fruitBasketA, fruitBasketB)); // true
        out.println("Equals: " + Arrays.equals(fruitBasketA, fruitBasketC)); // false
        out.println("Equals: " + Arrays.equals(fruitBasketA, fruitBasketE)); // false

        int[] diceA = { 5, 2, 6, 3 };
        int[] diceB = { 5, 2, 6, 3 };
        int[] diceC = { 5, 2, 3, 6 };
        int[] diceD = { 5, 2, 3 };
        int[] diceE = { 5, 6 };
        out.println("Compare value: " + Arrays.compare(diceA, diceD)); // 1
        out.println("Compare value: " + Arrays.compare(diceA, diceE)); // -1
        out.println("Compare value: " + Arrays.compare(diceA, diceB)); // 0
        out.println("Compare value: " + Arrays.compare(diceC, diceD)); // 1

        String[] fruitBasketG = { "apples" };
        out.println("Mismatch index: "+Arrays.mismatch(fruitBasketA, fruitBasketC)); //2
        out.println("Mismatch index: "+Arrays.mismatch(fruitBasketA, fruitBasketG)); //0
        out.println("Mismatch index: "+Arrays.mismatch(fruitBasketA, fruitBasketB)); //-1
        out.println("Mismatch index: "+Arrays.mismatch(fruitBasketA, fruitBasketE)); //2

        out.println(Arrays.deepToString(new Object[]{new Object[]{fruitBasketA, fruitBasketB},
                new Object[]{fruitBasketA, fruitBasketB}}));
        out.println(Arrays.deepToString(new String[][][]{new String[][]{fruitBasketA, fruitBasketB},
                new String[][]{fruitBasketA, fruitBasketB}}));
    }
}
