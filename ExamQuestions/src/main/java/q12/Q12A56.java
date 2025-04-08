package q12;

import java.util.ArrayList;
import java.util.List;

public class Q12A56 {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add(0, "Ada");
        strList.add("Alyla");
        strList.set(strList.size()-1, "Otto");
        strList.add(strList.size()-1, "Anna");
        System.out.println(strList);                       // (1)
        int size = strList.size();
        for (int i = 0; i < size; ++i) {
            strList.add(strList.get(size-1-i));
        }
        System.out.println(strList);                       // (2)
    }
}

/*
* Select the two correct answers.

a. (1) will print [Ada, Alyla, Anna].
b. (1) will print [Ada, Anna, Otto].
c. (1) will print [Ada, Otto, Alyla].
d. (2) will print [Ada, Alyla, Anna, Anna, Alyla, Ada].
e. (2) will print [Ada, Anna, Otto, Otto, Anna, Ada].
f. (2) will print [Ada, Otto, Alyla, Alyla, Otto, Ada].
* */