package Questions;

import java.util.*;
class Fruit {}
class Apple extends Fruit {}

public class RQ100_15 {
    public static void main(String[] args) {
//        List<? extends Apple> lst1 = new ArrayList<Fruit>(); // (1)
        List<? extends Fruit> lst2 = new ArrayList<Apple>(); // (2)
        List<? super Apple> lst3 = new ArrayList<Fruit>();   // (3)
//        List<? super Fruit> lst4 = new ArrayList<Apple>();   // (4)
//        List<?> lst5 = lst1;                                 // (5)
        List<?> lst6 = lst3;                                 // (6)
        List lst7 = lst6;                                    // (7)
        List<?> lst8 = lst7;                                 // (8)
    }
}