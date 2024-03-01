package questions;

import java.util.ArrayList;
import java.util.List;

public class RQ12A40 {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Anna"); strList.add("Ada"); strList.add(null);
        strList.add("Bob"); strList.add("Bob"); strList.add("Adda");
        while (strList.remove("Bob"));
        System.out.println(strList);
    }
}