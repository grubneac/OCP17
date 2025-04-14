package q23;

import java.util.ArrayList;
import java.util.List;

interface Wagger{}
class Pet implements Wagger{}
class Dog extends Pet {}
class Cat extends Pet {}
public class Q100A51 {
//    public static void main(String[] args) {
//        List<Pet> p = new ArrayList<>();
//        List<Dog> d = new ArrayList<>();
//        List<Cat> c = new ArrayList<>();
//        examine(p);
//        examine(d);
//        examine(c);
//    }
//
//    static void examine(/* INSERT PARAMETER TYPE HERE */ pets) {      // (1)
//        System.out.print("Your pets need urgent attention.");
//    }
}
/*
*Select the three correct answers.

a. List<? extends Pet>
b. List<? super Pet>
c. List<? extends Wagger>
d. List<? super Wagger>
e. List<?>
* */