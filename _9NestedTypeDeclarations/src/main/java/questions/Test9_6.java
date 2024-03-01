package questions;

interface IntHolder { int getInt(); }

public class Test9_6 {
    //----(1)----
//    IntHolder makeIntHolder(int i) {
//        i = 10;
//        return new IntHolder() {
//            public int getInt() { return i; }
//        };
//    }
    //----(2)----
//    IntHolder makeIntHolder(final int i) {
//        return new IntHolder {
//            public int getInt() { return i; }
//        };
//    }
//    //----(3)----
    IntHolder makeIntHolder(int i) {
        class MyIH implements IntHolder {
            public int getInt() { return i; }
        }
        return new MyIH();
    }
//    //----(4)----
    IntHolder makeIntHolder2(final int i) {
        class MyIH implements IntHolder {
            public int getInt() { return i; }
        }
        return new MyIH();
    }
    //----(5)----
    IntHolder makeIntHolder3(int i) {
        return new MyIH(i);
    }
static class MyIH implements IntHolder {
    final int j;
    MyIH(int i) { j = i; }
    public int getInt() { return j; }
}

}
