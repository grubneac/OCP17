package questions;

import java.io.*;

public class RQ2 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("greetings.txt");
             BufferedReader br = new BufferedReader(fr)) {
            System.out.print(br.readLine() + "|");
            System.out.print(br.readLine() + "|");
            System.out.print(br.readLine() + "|");
        } catch (EOFException eofe) {
            System.out.println("End of stream");
        } catch (IOException ioe) {
            System.out.println("Input error");
        }
    }
}
/* cd \target\classes
java questions/RQ2
* Assume that the file greetings.txt exists in the current directory, has the required access permissions,
* and contains the following two text lines:

Hello
Howdy
Which statement is true about the program?

Select the one correct answer.
a. The program will fail to compile because the FileNotFoundException is not caught.
b. The program will compile, print Hello|Howdy|null|, and then terminate normally.
c. The program will compile and print Hello|Howdy|Input error.
d. The program will compile and print Hello|Howdy|End of stream.
e. The program will compile, print Hello|Howdy|, and then block in order to read from the file.
f. The program will compile, print Hello|Howdy|, and terminate because of an uncaught exception.
* */