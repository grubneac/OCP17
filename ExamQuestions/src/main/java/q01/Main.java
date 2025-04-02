package q01;

class Base {
    protected int i;

    Base() {
        add(1);
    }

    void add(int v) {
        i += v;
    }

    void print() {
        System.out.println(i);
    }
}

class Extension extends Base {
    Extension() {
        add(2);
    }

    void add(int v) {
        i += v * 2;
    }
}

public class Main {
    public static void main(String[] args) {
        bogo(new Extension());
    }

    static void bogo(Base b) {
        b.add(8);
        b.print();
    }
}
/*
*Select the one correct answer.

a. 9
b. 11
c. 13
d. 21
e. 22
* */
