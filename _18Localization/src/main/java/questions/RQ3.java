package questions;

import java.util.*;
public class RQ3 {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("resources", new Locale("en"));
        for (String key : new TreeSet<String>(rb.keySet())) {
            System.out.print(key+"="+rb.getString(key)+" ");
        }
    }
}

/*
* What is the result?
Select the one correct answer.

a. k1=d k2=e
b. k1=c k2=b
c. k1=a k2=b
d. k1=d k2=e
e. The program will throw an exception at runtime.
* */