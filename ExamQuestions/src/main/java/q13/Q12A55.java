package q13;

import java.util.ArrayList;
import java.util.List;

public class Q12A55 {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add(strList.size(), "Anna");
        strList.add(strList.size()-1, "Ada");
        strList.add(strList.size()-1, "Otto");
        strList.add(0, "Alyla");
        System.out.println(strList);
        int size = strList.size();
        for (int i = 0; i < size/2; ++i) {
            String strTemp = strList.get(i);
            strList.set(i, strList.get(size-1-i));
            strList.set(size-1-i, strTemp);
        }
        System.out.println(strList);
    }
}
/*
* Select the one correct answer.

a. The program will fail to compile.
b. The program will throw an IndexOutOfBoundsException.
c. The program will throw a NullPointerException.

d. The program will print:
[Alyla, Ada, Otto, Anna]
[Anna, Otto, Ada, Alyla]

* e. The program will print:
[Ada, Otto, Alyla, Anna]
[Anna, Alyla, Otto, Ada]
* */