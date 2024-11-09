package questions;

import java.io.*;
public class RQ5 {
    public static void main(String[] args) {

        Product p = new Food("cookie", 300);
        try(ObjectOutputStream out =
                    new ObjectOutputStream(new FileOutputStream("prod.dat"))) {
            out.writeObject(p);
        } catch (Exception ex) {
            System.out.println("error serializing product");
        }
        try(ObjectInputStream in =
                    new ObjectInputStream(new FileInputStream("prod.dat"))) {
            p = (Food)in.readObject();
        } catch (Exception ex) {
            System.out.println("error deserializing product");
        }
        System.out.println(p);
    }
}

/*
* What is the result?

Select the one correct answer.
a. product food cookie 300
b. product food product food cookie 300
c. product food cookie 0
d. product food product food cookie 0
e. product food error serializing product
f. product food error deserializing product
* */
