package q03;

interface I {
    void setValue(int val);
    int getValue();
}

/*
* Given the following interface declaration, which declaration is valid?
* Select the one correct answer.

a.
class A extends I {
  int value;
  void setValue(int val) { value = val; }
  int getValue() { return value; }
}
*
b.
interface B extends I {
  void increment();
}
*
c.
abstract class C implements I {
  int getValue() { return 0; }
  abstract void increment();
}
*
d.
interface D implements I {
  void increment();
}
*
e.
class E implements I {
  int value;
  public void setValue(int val) { value = val; }
}
* */