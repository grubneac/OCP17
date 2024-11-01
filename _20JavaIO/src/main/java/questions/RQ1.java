package questions;

import java.io.*;
public class RQ1 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("./seq.txt");
             InputStreamReader isr = new InputStreamReader(fis);) {
            int i = isr.read();
            while (i != -1) {
                System.out.print((char)i + "|");
                i = isr.read();
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("File not found");
        } catch (EOFException eofe) {
            System.out.println("End of stream");
        } catch (IOException ioe) {
            System.out.println("Input error");
        }
    }
}
/*
cd \target\classes
java questions/RQ2
* Assume that the file seq.txt exists in the current directory, has the required access permissions,
* and contains the string "Hello".
Which statement about the program is true?

Select the one correct answer.
a. The program will fail to compile because a certain unchecked exception is not caught.
b. The program will compile and print H|e|l|l|o|Input error.
c. The program will compile and print H|e|l|l|o|End of stream.
d. The program will compile, print H|e|l|l|o|, and then terminate normally.
e. The program will compile, print H|e|l|l|o|, and then block in order to read from the file.
f. The program will compile, print H|e|l|l|o|, and terminate because of an uncaught exception.
* */