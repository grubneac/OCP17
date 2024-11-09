package questions;

import java.io.*;
public class RQ3 {

    public static void main(String args[])
            throws IOException, ClassNotFoundException {
        try (FileOutputStream outputFile = new FileOutputStream("storage.dat");
             ObjectOutputStream outputStream = new ObjectOutputStream(outputFile)) {
            Student stud1 = new Student("Aesop", 100);
            System.out.print(stud1);
            outputStream.writeObject(stud1);
        }

        try (FileInputStream inputFile = new FileInputStream("storage.dat");
             ObjectInputStream inputStream = new ObjectInputStream(inputFile)) {
            Student stud2 = (Student) inputStream.readObject();
            System.out.println(stud2);
        }
    }
}

/*
* Which statement about the program is true?

Select the one correct answer.
a. It will fail to compile.
b. It will compile, but it will throw an exception at runtime.
c. It will print (Aesop, 100)(Aesop, 100).
d. It will print (Aesop, 100)(null, 100).
e. It will print (Aesop, 100)(NoName, 100).
* */