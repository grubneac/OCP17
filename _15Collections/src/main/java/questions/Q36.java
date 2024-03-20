package questions;

import java.util.*;
public class Q36 {
    public static void main(String[] args) {
        String s1 = "London";
        String s2 = "Bergen";
        String s3 = "Saratov";
        Deque<String> trip = new ArrayDeque<>();
        String r1 = trip.pollFirst();
        trip.offerFirst(s1);
        trip.offerFirst(s2);
        String r2 = trip.pollFirst();
        String r3 = trip.peekFirst();
        trip.offerLast(s3);
        trip.offerLast(s1);
        String r4 = trip.pollLast();
        String r5 = trip.peekLast();
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
}

/*
* What is the result?
Select the one correct answer.

a. An UnsupportedOperationException is thrown at runtime.
b. A NullPointerException is thrown at runtime.
c. null Bergen London London Saratov
d. null Bergen Bergen London London
e. Bergen London London Saratov
f. Bergen Bergen London London
* */