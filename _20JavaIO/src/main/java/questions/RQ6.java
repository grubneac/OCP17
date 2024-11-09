package questions;

import java.io.*;
public class RQ6 {
    public static void main(String[] args) {
        char[] buffer = new char[4];
        int count = 0;
        try(FileReader in = new FileReader("test1.txt");
            FileWriter out = new FileWriter("test2.txt")) {
            while((count = in.read(buffer)) != -1) {
                out.write(buffer);
            }
        } catch (Exception ex) {
            System.out.println("error");
        }
    }
}
/*
* Assume that the text1.txt file only contains the line "abcdefg".
*  What is the content of the text2.txt file after the program is run?

Select the one correct answer.
a. abcdefg
b. abcd
c. abcdefgd
d. abcdef
* */