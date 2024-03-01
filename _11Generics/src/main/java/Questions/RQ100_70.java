package Questions;

import java.util.*;
public class RQ100_70 {
    public static void main(String[] args) {
        List<Integer> glst1 = new ArrayList();       //(1)
        List nglst1 = glst1;                         //(2)
        List nglst2 = nglst1;                        //(3)
        List<Integer> glst2 = glst1;                 //(4)
    }
}