/* 4kyu
* We need to sum big numbers and we require your help.

Write a function that returns the sum of two numbers. The input numbers are strings and the function must return a string.
* */

public class AddingBigNumbers {
    public static String add(String a, String b) {
        StringBuilder sbResult = new StringBuilder();
        int first, second, forNextLevel = 0;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            first =  i >= 0?a.charAt(i) - '0':0;
            second = j >= 0?b.charAt(j) - '0':0;
            int sum = first + second + forNextLevel;
            if (sum > 9) {
                forNextLevel = 1;
                sum -= 10;
            } else {
                forNextLevel = 0;
            }
            sbResult.append(sum);
        }
        if (forNextLevel > 0) {
            sbResult.append(forNextLevel);
        }
        return sbResult.reverse().toString();
    }
}
