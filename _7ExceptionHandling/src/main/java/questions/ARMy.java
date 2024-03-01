package questions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ARMy {

//    public static void methodA(String filename) throws FileNotFoundException {// (1)
//        var fis = new FileReader(filename);
//        try (var br = new BufferedReader(fis)) { }
//    }

    public static void methodB(String filename)throws IOException {            // (2)
        var fis = new FileReader(filename);
        try (var br = new BufferedReader(fis)) { }
    }

    public static void methodC(String filename)throws FileNotFoundException { // (3)
        var fis = new FileReader(filename);
        try (var br = new BufferedReader(fis)) { }
        catch (IOException ioe) { }
    }

//    public static void methodD(String filename) throws FileNotFoundException {// (4)
//        try (var fis = new FileReader(filename);
//             var br = new BufferedReader(fis)) { }
//    }

    public static void methodE(String filename) throws IOException {           // (5)
        try (FileReader fis = null; BufferedReader br = null) {
        }
    }

//    public static void methodF(String filename) {                              // (6)
//        try (FileReader fis = null; BufferedReader br = null) {
//        }
//    }
//
//    public static void methodG(String filename)
//            throws IOException {                            // (7)
//        try (FileReader fis = null; BufferedReader br = null) {
//            fis = new FileReader(filename);
//            br = new BufferedReader(fis);
//        }
//    }
}