package questions;
import java.util.*;
class Fruity {
    private String fName;
    Fruity(String fName) { this.fName = fName; }

    public void setName(String newName) { this.fName = newName; }
    public String toString() { return fName; }
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Fruity)) return false;
        return fName.equalsIgnoreCase(((Fruity)other).fName);
    }
}

public class RQ400A50 {
    public static void main(String[] args) {
        Fruity apple = new Fruity("Apple");
        Fruity orange = new Fruity("Orange");
        List<Fruity> list = new ArrayList<>();
        list.add(apple); list.add(orange); list.add(apple);
        System.out.println("Before: " + list);
        // (1) INSERT CODE HERE
        System.out.println("After:  " + list);
    }
}


/*
* Which code, when inserted at (1), will result in the following output from the program:

Before: [Apple, Orange, Apple]
After:  [Orange]
Select the two correct answers.

* a.

for (Fruity f : list) {
  if (f.equals(apple))
    list.remove(f);
}

* b.

int i = 0;
for (Fruity f : list) {
  if (f.equals(apple))

    list.remove(i);
  i++;
}

* c.

for (int j = 0; j < list.size(); j++) {
  Fruity f = list.get(j);
  if (f.equals(apple))
    list.remove(j);
}

* d.

Iterator<Fruity> itr = list.iterator();
while (itr.hasNext()) {
  Fruity f = itr.next();

  if (f.equals(apple))
    itr.remove();
}
*
* */