public class Preliminaries {
    public static void main(String[] args) {

        Node<Integer> intNode = new Node<>(2018, null);
        Integer iRef = intNode.getData();        // Integer object with int value 2018
        intNode.setData(2020);                   // Ok.
//  intNode.setData("TwentyTwenty");         // (1) Compile-time error!
        intNode.setNext(new Node<>(2019, null)); // (2020, (2019, null))
//  intNode.setNext(new Node<>("Hi", null)); // (2) Compile-time error!

        Node<String> strNode = new Node<>("Hi", null);
//  intNode = strNode;              // (3) Compile-time error!
        String str = strNode.getData(); // (4) No explicit cast necessary.

        Node rawNode = intNode;         // (5) Assigning to raw type always possible.
        rawNode.setData("BOOM");        // (6) Unchecked call warning!
        intNode = rawNode;              // (7) Unchecked conversion warning!
        Integer data = intNode.getData();// (8) ClassCastException!
//  iRef = rawNode.getData();       // (9) Compile-time error!

        Node<Integer> intNode1    = new Node<>(2020,null);         // (1)
        Node<Double>  doubleNode = new Node<>(3.14,null);         // (2)
        Node<Number>  numNode    = new Node<>(2021, null);        // (3)

//        numNode.setNext(intNode1);                           // (6) Compile-time error!
//        numNode = new Node<Number>(2030, doubleNode);       // (7) Compile-time error!
        numNode = new Node<Number>(2030,  new Node<Number>(1, null));       // (7) Compile-time error!
    }
}