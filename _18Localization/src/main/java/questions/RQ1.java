package questions;
import java.util.*;

public class RQ1 {
    public static void main(String[] args) {
        ResourceBundle resources = ResourceBundle.getBundle("pkg.MyResources",
                Locale.FRANCE);
        for (String key : resources.keySet()) {
            System.out.println(resources.getString(key));
        }
    }
}
/*
* Select the one correct answer.
a. The program output will contain the following lines:
Howdy!
Bye!
Thank you!
*
b. The program output will contain the following lines:
 Howdy!
See ya!
Thank you!
*
c. When run, the program will throw a MissingResourceException.

d. When run, the program will terminate normally without printing anything.
* */