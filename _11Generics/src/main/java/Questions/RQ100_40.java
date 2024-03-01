package Questions;

import java.util.*;
public class RQ100_40 {
    public static void main(String[] args) {
        List <? super Integer> sList = new ArrayList<Number>(); //(1)
        int i = 2020;
        sList.add(i);
        sList.add(++i);                                         //(2)
//        Number num = sList.get(0);                              //(3)
    }
}