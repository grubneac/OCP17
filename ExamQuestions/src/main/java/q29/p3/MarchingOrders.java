package q29.p3;

// (4) INSERT IMPORTS HERE
import  q29.p2.DefenceInDepth;
import static q29.p2.DefenceInDepth.*;
import static q29.p2.DefenceInDepth.Military.March.LEFT;
public class MarchingOrders {
    public static void main(String[] args) {
        System.out.println(March.LEFT);
        System.out.println(DefenceInDepth.March.LEFT);
        System.out.println(q29.p2.DefenceInDepth.March.LEFT);
        System.out.println(Military.March.LEFT);
        System.out.println(DefenceInDepth.Military.March.LEFT);
        System.out.println(q29.p2.DefenceInDepth.Military.March.LEFT);
        System.out.println(LEFT);
    }
}

/*
* Select the three correct answers.

a.
import q29.p2.*;
import q29.p2.DefenceInDepth.*;
import static q29.p2.DefenceInDepth.Military.March.LEFT;
b.
import q29.p2.*;
import static q29.p2.DefenceInDepth.*;
import static q29.p2.DefenceInDepth.Military.March.LEFT;
c.
import q29.p2.DefenceInDepth;
import static q29.p2.DefenceInDepth.*;
import static q29.p2.DefenceInDepth.Military.March.LEFT;
d.
import static q29.p2.DefenceInDepth;
import static q29.p2.DefenceInDepth.*;
import static q29.p2.DefenceInDepth.Military.March.LEFT;
e.
import q29.p2.*;
import static q29.p2.DefenceInDepth.*;
import static q29.p2.DefenceInDepth.Military.*;
f.
import q29.p2.*;
import static q29.p2.DefenceInDepth.*;
import static q29.p2.DefenceInDepth.Military.March;
*
* */