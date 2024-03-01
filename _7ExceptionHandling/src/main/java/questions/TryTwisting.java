package questions;

import java.io.EOFException;
import java.io.IOException;

public class TryTwisting {
    public static void main(String[] args) {
        try {
            justDoIt();
        } catch (Exception t1) {
            System.out.println(t1);
            for (Throwable t : t1.getSuppressed())
                System.out.println("Suppressed: " + t);
        }
    }

    public static void justDoIt() throws Exception {
        IOException t2 = null;
        try {
            t2 = new IOException();
            throw t2;
        } finally {
            try {
                throw new EOFException();
            } catch (Exception t3) {
                t2.addSuppressed(t3);
            }
        }
    }
}