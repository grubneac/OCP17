package Questions;

class Box2<T> {
    Box2()         {System.out.println(this);}               // (1)
    <V> Box2(V v)      {System.out.println(v);}                  // (2)
    <V> Box2(T t, V v) {System.out.println(t + ", " + v);}       // (3)

    public static void main(String[] args) {
//        Select the one correct answer.
//        a.
        Box2<String> ref1 = new Box2<>();

//        b.
        Box2<String> ref2 = new Box2<>("one");

//        c.
        Box2<String> ref3 = new Box2<>(2020);

//        d.
        Box2<Integer> ref4 = new Box2<>(2020, "one");

//        e.
        Box2<String> ref5 = new Box2<>("one", 2020);

//        f.
//        Box2<Integer> ref6 = new Box2<>("one", 2020);

    }
}