package q33;

class MySuperclass {
    public        Integer step1(int i)                    { return 1; }     // (1)
    protected     String  step2(String str1, String str2) { return str1; }  // (2)
    public        String  step2(String str1)              { return str1; }  // (3)
    protected static String  step2()                         { return "Hi"; }  // (4)

    public MyClass      makeIt()  { return new MyClass(); }                 // (5)
    public MySuperclass makeIt2() { return new MyClass(); }                 // (6)
}

public class MyClass extends MySuperclass {
    // (7) INSERT METHOD DECLARATION HERE
}
/*
* Select the two correct answers.

a. public int step1(int i) { return 1; }
b. public String step2(String str2, String str1) { return str1; }
c. private void step2() { }
d. private static void step2() { }
e. private static String step2(String str) { return str; }
f. public MySuperclass makeIt() { return new MySuperclass(); }
g. public MyClass makeIt2() { return new MyClass(); }
* */