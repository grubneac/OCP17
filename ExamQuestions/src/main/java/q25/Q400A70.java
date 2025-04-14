package q25;

import java.util.ArrayList;
import java.util.List;
public class Q400A70 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2019); list.add(2020); list.add(2021);
        System.out.println("Before: " + list);
        for (int i : list) {
            int index = list.indexOf(i);
            list.set(index, ++i);
        }
        System.out.println("After:  " + list);
    }
}

/*
* Select the one correct answer.

a. The program will print:
Before: [2019, 2020, 2021]
After: [2020, 2021, 2022]

b. The program will print:
Before: [2019, 2020, 2021]
After: [2022, 2020, 2021]

c. The program will print:
Before: [2019, 2020, 2021]
After: [2019, 2020, 2021]

d. The program will print:
Before: [2019, 2020, 2021]
After: [2020, 2021, 2019]
* */