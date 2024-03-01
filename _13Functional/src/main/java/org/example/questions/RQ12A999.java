package org.example.questions;

interface AgreementA { void doIt(); }
interface AgreementB extends AgreementA {}
interface AgreementC extends AgreementB {
    void doIt();
    boolean equals(Object obj);
}

class Beta implements AgreementB {
    public void doIt() {
        System.out.print("Jazz|");
    }
}

public class RQ12A999 {
    public static void main(String[] args) {
        AgreementA a = () -> System.out.print("Java|");        // (1)
        AgreementB b = () -> System.out.print("Jive|");        // (2)
        AgreementC c = () -> System.out.print("Jingle|");      // (3)
        Object o = a = c;                                      // (4)
        b = new Beta();                                        // (5)
        a.doIt();                                              // (6)
        b.doIt();                                              // (7)
        c.doIt();                                              // (8)
        ((AgreementA) o).doIt();                               // (9)
    }
}
