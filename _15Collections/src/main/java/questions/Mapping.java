package questions;

import java.util.*;
public class Mapping {
    public static void main(String[] args) {

        NavigableMap<String, Integer> myMap
                = new TreeMap<>(Collections.reverseOrder());
        myMap.put("Soap", 10); myMap.put("Shampoo", 20); myMap.put("Salts", 30);
        // (1) INSERT CODE HERE
        System.out.println(myMap);
    }
}

/*
* Select the three correct answers.

a.
for (Map.Entry<String, Integer> entry : myMap.entrySet())
  if (entry.getKey().equals("Shampoo"))
    myMap.remove("Shampoo");

* b.
for (Iterator<String> iterator = myMap.keySet().iterator();
     iterator.hasNext();)
  if (iterator.next().equals("Shampoo"))
    iterator.remove();

* c.
for (Iterator<String> iterator = myMap.keySet().iterator();
     iterator.hasNext();) {
  if (iterator.next().equals("Shampoo"))
    myMap.remove("Shampoo");

* d.
for (Map.Entry<String, Integer> entry : myMap.entrySet())
  if (entry.getKey().equals("Shampoo"))
    myMap.remove(entry);

* e.
myMap.subMap("Shampoo", true, "Shampoo", true).clear();

* f.
myMap.compute("Shampoo", (k, v) -> null);
* */