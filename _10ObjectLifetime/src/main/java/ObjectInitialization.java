class SuperclassAA {
    protected int superValue;                              // (1)
    SuperclassAA() {                                        // (2)
        System.out.println("A.constr: Constructor in SuperclassA");
        this.doValue();                                      // (3)
    }
    void doValue() {                                       // (4)
        this.superValue = 911;
        System.out.println("A.doValue: superValue (from SuperclassA): " + this.superValue);
    }
}
//_______________________________________________________________________________
class SubclassBB extends SuperclassAA {
    private int value = 800;                               // (5)

    SubclassBB() {                                          // (6)
        System.out.println("B.constr: Constructor in SubclassB");
        this.doValue();
        System.out.println("B.constr: superValue (from SuperclassA): " + this.superValue);
    }
    @Override
    void doValue() {                                       // (7)
        System.out.println("B.doValue: value (from SubclassB): " + this.value);
    }
}
//_______________________________________________________________________________
public class ObjectInitialization {
    public static void main(String[] args) {

        System.out.println("Creating an object of SubclassB.");
        System.out.println("-------------------------------");
        new SubclassBB();                                     // (8)
    }
}