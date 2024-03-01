package questions;

class Music {
    static {
        System.out.print("-C-");
    }
    {
        System.out.print("-D-");
    }
    public Music(){
        System.out.print("-E-");
    }
}

class Song extends Music {
    static {
        System.out.print("-F-");
    }
    {
        System.out.print("-G-");
    }
    public Song(){
        System.out.print("-A-");
    }
}

public class MyClass4 {
    public static void main(String[] args) {
        Music x1 = new Song();
        Song x2 = new Song();
    }
}

/*
* Select the one correct answer.

a. -C--D--E--F--G--A--G--A--G--A-

b. -C--D--E--F--G--A--D--E--G--A-

c. -C--F--D--E--G--A--D--E--G--A-

d. -C--F--D--G--E--A--D--G--E--A-

e. -C--F--E--D--A--G--E--D--A--G-
* */
