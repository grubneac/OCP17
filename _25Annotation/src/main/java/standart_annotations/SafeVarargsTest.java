package standart_annotations;

import java.util.ArrayList;
import java.util.List;
public class SafeVarargsTest{
    @SafeVarargs                                          // (1)
    private static void printList(List<String>... toys) { // (2) List<String>[]
        for (List<String> toy : toys) {
            System.out.println(toy);
        }
    }

    public static void main(String[] args) {
        List<String> tList = new ArrayList<String>();
        tList.add("vaporizer"); tList.add("slime gun");
        printList(tList);                                   // (3) new List<String>[]
        System.out.println("----------------------------");
        List<String> tList3 = new ArrayList<String>();
        List<String> tList4 = new ArrayList<String>();
        tList3.add("vaporizer"); tList4.add("slime gun");
        printList(tList3,tList4);                                   // (3) new List<String>[]
    }
}