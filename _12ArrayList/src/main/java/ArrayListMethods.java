import java.util.*;

import static java.lang.System.out;

public class ArrayListMethods {

    public static void main(String[] args) {

        String[] wordArray = { "level", "Ada", "kayak", "Bob", "Rotator", "Bob" };

        out.println("(1) Create an empty list of strings:");
        List<String> strList = new ArrayList<>();
        printListWithIndex(strList);

        out.println("\n(2) Add elements to list:");
        for (String str : wordArray) {
            strList.add(str);
            printListWithIndex(strList);
        }
        out.println("Insert an element at index 2 in the list:");
        strList.add(2, "Java");
        printListWithIndex(strList);

        out.println("\n(3) Replace the element at index 1:");
        String oldElement = strList.set(1, "Naan");
        out.println("Element that was replaced: " + oldElement);
        printListWithIndex(strList);

        out.println("\n(4) Remove the element at index 0:");
        out.println("Element removed: " + strList.remove(0));
        printListWithIndex(strList);

        out.println("\n(5) Remove the first occurrence of \"Java\":");
        out.println("Element removed: " + strList.remove("Java"));
        printListWithIndex(strList);

        out.println("\n(6) Determine the size of the list:");
        out.println("The size of the list is " + strList.size());

        out.println("\n(7) Determine if the list is empty:");
        boolean result = strList.isEmpty();
        out.println("The list " + (result ? "is" : "is not") + " empty.");

        out.println("\n(8) Get the element at specific index:");
        out.println("First element: " + strList.get(0));
        out.println("Last element: " + strList.get(strList.size() - 1));

        out.println("\n(9) Compare two lists:");
        List<String> strList2 = new ArrayList<>(strList);
        boolean trueOrFalse = strList.equals(strList2);
        out.println("The lists strList and strList2 are"
                + (trueOrFalse ? "" : " not") + " equal.");
        strList2.add(null);
        printListWithIndex(strList2);
        trueOrFalse = strList.equals(strList2);
        out.println("The lists strList and strList2 are"
                + (trueOrFalse ? "" : " not") + " equal.");

        out.println("\n(10) Sublists as views:");
        out.println("Underlying list: " + strList); // [Naan, kayak, Bob, Rotator, Bob]
        List<String> strList3 = strList.subList(1, 4);
        out.println("Sublist before remove: " + strList3);    // [kayak, Bob, Rotator]
        out.println("Remove: " + strList3.get(0));  // "kayak"
        strList3.remove(0);                         // Remove element at index 0
        out.println("Sublist after remove: " + strList3);     // [Bob, Rotator]
        out.println("Underlying list: " + strList); // [Naan, Bob, Rotator, Bob]

        out.println("\n(11) Membership test:");
        boolean found = strList.contains("Naan");
        String msg = found ? "contains" : "does not contain";
        out.println("The list " + msg + " the string \"Naan\".");

        out.println("\n(12) Find the index of an element:");
        int pos = strList.indexOf("Bob");
        out.println("The index of string \"Bob\" is: " + pos);
        pos = strList.indexOf("BOB");
        out.println("The index of string \"BOB\" is: " + pos);
        pos = strList.lastIndexOf("Bob");
        out.println("The last index of string \"Bob\" is: " + pos);
        printListWithIndex(strList);

        out.println("\n(13) Iterating over the list using the for(;;) loop:");
        for (int i = 0; i < strList.size(); i++) {
            out.print(i + ":" + strList.get(i) + " ");
        }
        out.println();

        out.println("\n(14) Iterating over the list using the for(:) loop:");
        for (String str : strList) {
            out.print(str +  " ");
            // strList.remove(str);        // Throws ConcurrentModificationException.
        }
        out.println();

        out.println("\n(15) Convert list to array:");
        Object[] objArray = strList.toArray();
        out.println("Object[] length: " + objArray.length);
        out.print("Length of each string in the Object array: ");
        for (Object obj : objArray) {
            String str = (String) obj; // Cast required.
            out.print(str.length() + " ");
        }
        out.println();
        String[] strArray = strList.toArray(new String[0]);
        out.println("String[] length: " + strArray.length);
        out.print("Length of each string in the String array: ");
        for (String str : strArray) {
            out.print(str.length() + " ");
        }

        out.println("\n\n asList example");
        Integer[] array1 = new Integer[] {9, 1, 1};
        List<Integer> list1 = Arrays.asList(array1);          // (1) A list of Integer
        List<Integer> list2 = Arrays.asList(9, 1, 1);         // (2) Varargs

        int[] array2 = new int[] {9, 1, 1};                   // An array of int
// List<Integer> intList3 = Arrays.asList(array2);    // (3) Compile-time error!
//        intList3.add(5); // java.lang.UnsupportedOperationException
        out.println(list1);
        System.out.println(list1);                   // [9, 1, 1]
// list1.add(10);                            // (4) UnsupportedOperationException
        list1.set(0, 10);                            // (5)
        System.out.println(list1);                   // (6) [10, 1, 1]
        System.out.println(Arrays.toString(array1)); // (7) [10, 1, 1]
        List<Integer> sublist1 = list1.subList(0, 2);// (8)
        System.out.println(sublist1);                // [10, 1]
// sublist1.clear();                         // (9) UnsupportedOperationException
        Collections.sort(sublist1);                  // (10)
        System.out.println(sublist1);                // [1, 10]
        System.out.println(list1);                   // [1, 10, 1]
        System.out.println(Arrays.toString(array1)); // [1, 10, 1]

        //remove    duplicates
        String[] jiveArray   = new String[] {"java", "jive", "java", "jive"};
        Set<String> jiveSet  = new HashSet<>(Arrays.asList(jiveArray));// (1)
        String[] uniqueJiveArray = jiveSet.toArray(new String[0]);     // (2)
        System.out.println(Arrays.toString(uniqueJiveArray));           // (3) [java, jive]

        //Arrays.asList reflected on source, List.of doesn't
        Integer[] yrArray1 = {2020, 2021, 2022};
        List<Integer> yrlist1 = Arrays.asList(yrArray1);
        yrArray1[0] = 2019;                                    // Modify the array reflected on list
        yrlist1.set(0, 2018);                                    // Modify the list reflected on array
//        yrlist1.add(2023);   // can't add element UnsupportedOperationException
//        yrlist1.remove(0);   // can't remove element UnsupportedOperationException
        out.println("yrArray1: " + Arrays.toString(yrArray1)); //     [2019, 2021, 2022]
        out.println("yrlist1: " + yrlist1);                    // (1) [2019, 2021, 2022]

        Integer[] yrArray2 = {2020, 2021, 2022};
        List<Integer> yrlist2 = List.of(yrArray2);
        yrArray2[0] = 2019;                                    // Modify the array doesn't reflected on list
//        yrlist2.set(0, 2018);                                // Modify the list UnsupportedOperationException
//        yrlist2.add(0, 2018);                                // Add to the list UnsupportedOperationException
//        yrlist2.remove(0);                                  // remove from the list UnsupportedOperationException
        out.println("yrArray2: " + Arrays.toString(yrArray2)); //     [2019, 2021, 2022]
        out.println("yrlist2: " + yrlist2);                    // (2) [2020, 2021, 2022]

        //null
        List<Integer> yrList5 = Arrays.asList(2020, 2021, null);  // OK.
//        List<Integer> yrlist6 = List.of(2020, 2021, null);        // NullPointerException
        boolean flag1 = Arrays.asList(2021, 2022).contains(null); // OK.
//        boolean flag2 = List.of(2021, 2022).contains(null);       // NullPointerException
    }

    /**
     * Print the elements of a list, together with their index:
     * [0:value0, 1:value1, ...]
     * @param list   List to print with index
     */
    public static <E> void printListWithIndex(List<E> list) {            // (16)
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            newList.add(i + ":" + list.get(i));
        }
        out.println(newList);
    }
}