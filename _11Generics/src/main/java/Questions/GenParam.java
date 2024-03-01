package Questions;

import java.util.*;
public class GenParam {
    public static void main(String[] args) {
        List<Number> numList = new ArrayList<>();
        List<Integer> intList = new ArrayList<>();
        // (1) INSERT CODE HERE
    }

    static <T> void move(List<? extends T> lst1, List<? super T> lst2) {}
}

/*
Select the three correct answers.

a. GenParam.move(numList, intList);

b. GenParam.<Number>move(numList, intList);

c. GenParam.<Integer>move(numList, intList);

d. GenParam.move(intList, numList);

e. GenParam.<Number>move(intList, numList);

f. GenParam.<Integer>move(intList, numList);
* */