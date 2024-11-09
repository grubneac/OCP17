package questions;

import java.io.*;
public class RQ4 {

    public static void main(String args[])
            throws IOException, ClassNotFoundException {
        try (FileOutputStream outputFile = new FileOutputStream("storage.dat");
             ObjectOutputStream outputStream = new ObjectOutputStream(outputFile)) {
            GraduateStudent2 stud1 = new GraduateStudent2("Aesop", 100, 1);
            System.out.print(stud1);
            outputStream.writeObject(stud1);
        }

        try (FileInputStream inputFile = new FileInputStream("storage.dat");
             ObjectInputStream inputStream = new ObjectInputStream(inputFile)) {
            GraduateStudent2 stud2 = (GraduateStudent2) inputStream.readObject();
            System.out.println(stud2);
        }
    }
}

/*
* Which statement about the program is true?

Select the one correct answer.
a. It will fail to compile.
b. It will compile, but it will throw an exception at runtime.
c. It will print (Aesop, 100, 1)(Aesop, 100, 1).
d. It will print (Aesop, 100, 1)(NoName, 0, 1).
e. It will print (Aesop, 100, 1)(NewName, 200, 2).
* */