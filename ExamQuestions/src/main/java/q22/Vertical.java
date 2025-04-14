package q22;

public class Vertical {
    private int alt;
    public synchronized void up() {
        ++alt;
    }
    public void down() {
        --alt;
    }
    public synchronized void jump() {
        int a = alt;
        up();
        down();
        System.out.println(a == alt);
    }
}
/*
* Select the two correct answers.

a. The code will fail to compile.
b. Different threads can execute the up() method concurrently.
c. Different threads can execute the down() method concurrently.
d. Different threads can execute both the up() and the down() methods concurrently.
e. The jump() method will always print true.
* */
