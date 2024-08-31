package questions;

import java.util.LinkedList;
import java.util.List;

public class EpamQuestion {
    public static void main(String[] args) {
        int res = count(new int[]{0, 4, 8, -1000, 2000, 5000, 8000});
        if (res != 4) throw new RuntimeException(res + "!=4 /1");
        res = count(new int[]{1, 2, 3, 4, 5, 6, 8, 7, 9, 10});
        if (res != 6) throw new RuntimeException(res + "!=6 /2");
        res = count(new int[]{1, 2, 3, 5, 7, 9});
        if (res != 4) throw new RuntimeException(res + "!=4 /3");
        res = count(new int[]{1, 1, 1});
        if (res != 3) throw new RuntimeException(res + "!=3 /4");
        res = count(new int[]{6, 5, 4, 2, 1, 0, -1});
        if (res != 4) throw new RuntimeException(res + "!=4 /5");
        res = count(new int[]{1, 1, 1, 2, 3, 4, 7, 18, 29, 40, 51});
        if (res != 5) throw new RuntimeException(res + "!=5 /6");
        res = count(new int[]{1, 2, 3});
        if (res != 3) throw new RuntimeException(res + "!=3 /7");
        res = count(new int[]{1, 2, 1});
        if (res != 2) throw new RuntimeException(res + "!=2 /8");
        res = count(new int[]{3, 2, 1});
        if (res != 3) throw new RuntimeException(res + "!=3 /9");
        res = count(new int[]{1, 3});
        if (res != 2) throw new RuntimeException(res + "!=2 /10");
        res = count(new int[]{1});
        if (res != 1) throw new RuntimeException(res + "!=1 /11");
        System.out.println("OK");
    }


    static int count(int[] elements) {
        if (elements.length <= 1) {
            return 1;
        }
        Counters counters = new Counters();

        for (int i = 1; i < elements.length; i++) {
            counters.addPair(elements[i - 1], elements[i]);
        }
        return counters.getMaxSeqSize();

    }

}

class Counters {
    private final LinkedList<Subsequence> listEqualSpaceElements;

    public Counters() {
        this.listEqualSpaceElements = new LinkedList<>();
    }

    public int getMaxSeqSize() {
        return listEqualSpaceElements.stream()
                .mapToInt(a -> a.totalList.size())
                .max().orElse(0);
    }

    public void addPair(int prevElement, int nextElement) {
        Integer space = nextElement - prevElement;
        if (listEqualSpaceElements.isEmpty()) {
            listEqualSpaceElements.add(new Subsequence());
            listEqualSpaceElements.get(0).spaceElement = space;
            listEqualSpaceElements.get(0).totalList.add(prevElement);
            listEqualSpaceElements.get(0).totalList.add(nextElement);
        } else {
            if (!listEqualSpaceElements.getLast().spaceElement.equals(space)) {
                listEqualSpaceElements.add(new Subsequence());
                listEqualSpaceElements.getLast().spaceElement = space;
                listEqualSpaceElements.getLast().totalList.add(prevElement);
            }
            listEqualSpaceElements.getLast().totalList.add(nextElement);
        }
    }


    class Subsequence {
        private Integer spaceElement;
        private final List<Integer> totalList;

        public Subsequence() {
            this.spaceElement = 0;
            this.totalList = new LinkedList<>();
        }
    }
}