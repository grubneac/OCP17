package q36;

import java.util.*;
public class LocatingBundlesForDefaultLocale {
    public static void main(String[] args) {
        Locale norLocale = new Locale("no", "NO");
        ResourceBundle rbs = ResourceBundle.getBundle("MyResources", norLocale);
        System.out.println(rbs.getString("greeting"));
        Locale.setDefault(norLocale);
        System.out.println(rbs.getString("greeting"));
    }
}
/*Assuming that the current default locale is "en_US", what will be the result of compiling and running the following program?
*Select the one correct answer.

a. When run, the program will print the following and terminate normally. Long time no see! Long time no see!
b. When run, the program will print Long time no see! and terminate normally.
c. When run, the program will print Long time no see! and then throw a Missing-ResourceException.
d. When run, the program will immediately throw a MissingResourceException.
e. When run, the program will terminate normally without printing anything.
* */