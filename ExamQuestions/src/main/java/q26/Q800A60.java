package q26;

import java.io.*;
public class Q800A60 {
    public static void main(String[] args)
            throws IOException, ClassNotFoundException {
        try (FileOutputStream outputFile = new FileOutputStream("storage.dat");
             ObjectOutputStream outputStream = new ObjectOutputStream(outputFile)) {
            GraduateStudent stud1 = new GraduateStudent("Aesop", 100, 1);
            System.out.print(stud1);
            outputStream.writeObject(stud1);
        }

        try (FileInputStream inputFile = new FileInputStream("storage.dat");
             ObjectInputStream inputStream = new ObjectInputStream(inputFile)) {
            GraduateStudent stud2 = (GraduateStudent) inputStream.readObject();
            System.out.println(stud2);
        }
    }
}
/*
* Which statement is true about the program?
Select the one correct answer.

a. It will fail to compile.
b. It will compile, but it will throw an exception at runtime.
c. It will print (Aesop, 100, 1)(NoName, 0, 1).
d. It will print (Aesop, 100, 1)(Aesop, 100, 1).
e. It will print (Aesop, 100, 1)(null, 0, 1).
* */
