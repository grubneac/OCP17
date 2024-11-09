package questions;

import java.io.*;
public class RQ7 {
    public static void main(String[] args) {
        Album a = new Album("Songs", 2);
        try (ObjectOutputStream out =
                     new ObjectOutputStream(new FileOutputStream("song.dat"))) {
            out.writeObject(a);
        } catch (Exception ex) {
            System.out.println("error serializing product");
        }
        try (ObjectInputStream in =
                     new ObjectInputStream(new FileInputStream("song.dat"))) {
            a = (Album)in.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(a);
    }
}

/*
* What is the result?

Select the one correct answer.

a. Songs 5 3
b. Songs 5 2
c. Songs 5 0
d. Songs 0 3
e. Songs 0 2
f. Songs 0 0
* */
