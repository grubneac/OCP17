package questions;

public class MyClass2 {
    static int gap = 10;
    double length;
    final boolean active;

    // (1) INSERT CODE HERE
    { active = (gap > 5); length = 5.5 + gap;}
}
/*
* Select the one correct answer.

a. instance { active = true; }

b. FirstClass { gap += 5; }

c. { gap = 5; length = (active ? 100 : 200) + gap; }

d. { }

e. { length = 4.2; }

f. { active = (gap > 5); length = 5.5 + gap;}
* */