package questions;

import java.util.*;
public class RQ4 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("ru"));
        ResourceBundle rb = ResourceBundle.getBundle("pkg4.resources",new Locale("en"));
        for (String key : new TreeSet<String>(rb.keySet())) {
            System.out.print(key+"="+rb.getString(key)+" ");
        }
    }
}

/*
*What is the result?
Select the one correct answer.

a. k1=c k2=B
b. k1=c k2=b
c. k1=A k2=B
d. The program will throw an exception at runtime.
* */