package questions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class RQ1 {
    public static void main(String[] args) {
        var values = List.of("1", "2", "3", "4", "5", "6", "7", "8");
        var list1 = new CopyOnWriteArrayList<Integer>();
        for (String value: values) {
            new Thread(() -> {
                list1.add(Integer.valueOf(value));
            }).start();
        }
        System.out.println("list1: " + list1);

        var list2 = values.parallelStream().map(v->Integer.valueOf(v))
                .toList();
        System.out.println("list2" + list2);

        var list3 = new ArrayList<Integer>();
        values.parallelStream().map(v->Integer.valueOf(v)).forEach(v->list3.add(v));
        System.out.println("list3" + list3);
    }
}

/*
* Which lists will always print the same values as in the initial list?
Select the one correct answer.

a. list1
b. list2
c. list3
d. list1 and list2
e. list2 and list3
f. list1 and list3
g. All of the lists
h. None of the lists
* */
