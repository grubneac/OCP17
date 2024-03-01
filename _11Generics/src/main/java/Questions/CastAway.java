package Questions;

import java.util.*;

public class CastAway {
    public static void main(String[] args) {
        Object obj = new ArrayList<Integer>();         // (1)
        List<?>       list1 = (List<?>) obj;           // (2)
        List<?>       list2 = (List) obj;              // (3)
        List          list3 = (List<?>) obj;           // (4)
        List<Integer> list4 = (List) obj;              // (5)
        List<Integer> list5 = (List<Integer>) obj;     // (6)
    }
}