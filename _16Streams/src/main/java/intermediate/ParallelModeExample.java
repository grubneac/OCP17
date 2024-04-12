package intermediate;

import util.CD;

import java.util.stream.Stream;

public class ParallelModeExample {
    public static void main(String[] args) {
        Stream<CD> seqStream1
                = CD.cdList.stream().filter(CD::isPop);                         // Sequential
        System.out.println(seqStream1.isParallel());                      // false
        Stream<CD> seqStream2
                = CD.cdList.stream().sequential().filter(CD::isPop);            // Sequential
        System.out.println(seqStream2.isParallel());                      // false
        Stream<CD> seqStream3
                = CD.cdList.stream().parallel().filter(CD::isPop).sequential(); // Sequential
        System.out.println(seqStream3.isParallel());                      // false
        Stream<CD> paraStream1
                = CD.cdList.stream().parallel().filter(CD::isPop);              // Parallel
        System.out.println(paraStream1.isParallel());                      // true
        Stream<CD> paraStream2
                = CD.cdList.stream().filter(CD::isPop).parallel();              // Parallel
        System.out.println(paraStream2.isParallel());                      // true
    }

}
