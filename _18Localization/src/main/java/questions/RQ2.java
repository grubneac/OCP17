package questions;

import java.util.*;
public class RQ2 {
    public static void main(String[] args) {
        ResourceBundle resources = ResourceBundle.getBundle("pkg3.MyResources",
                Locale.ENGLISH);
        System.out.println(resources.getString("farewell"));
    }
}

/*
* Select the one correct answer.

a. See ya!
b. Have a good one!
c. Goodbye!
d. When run, the program will throw a MissingResourceException.
e. When run, the program will terminate normally without printing anything.
*
* */