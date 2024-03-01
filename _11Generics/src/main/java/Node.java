import java.util.HashMap;
import java.util.List;

class Node<E> {
    private E            data;    // Data                           (1)
    private Node<E>      next;    // Reference to next node         (2)
    Node(E data, Node<E> next) {                                 // (3)
        this.data = data;
        this.next = next;
    }
    public void    setData(E data)       { this.data = data; }   // (4)
    public E       getData()             { return this.data; }   // (5)
    public void    setNext(Node<E> next) { this.next = next; }   // (6)
    public Node<E> getNext()             { return this.next; }   // (7)
    @Override public String toString() {                         // (8)
        return this.data.toString() +
                (this.next == null ? " --> NULL" : " --> " + this.next);
    }
    public static void main(String[] args) {
        Node node1 = new Node(4, null); // 4 --> null
        Node node2 = new Node("June", node1);    // "June" --> 4 --> null
        Node<Double> doubleNode = new Node<Double>(20.20, node2);
        Node node3 = new Node("July", doubleNode);    // "July" --> "June" --> 4 --> null
        System.out.println(node3);
        Double dd = doubleNode.getData();
        String str = (String) node3.getData();

        Node<String> lst = new Node<>("Hi", null); // Actual type parameter inferred.
        String data1 = lst.getData();

        Node<String>  strNode = new Node<>(null, null); // Actual type parameter: String.
        Node<Integer> intNode = new Node<>(null, null); // Actual type parameter: Integer.
        Node<Number>  numNode = new Node<>(null, null); // Actual type parameter: Number.
        Node<Number>  lstNode = new Node<>(2021, null); // Actual type parameter: Number.

        Node node = new Node(2021, null);
        Integer data2 = (Integer) node.getData();
        Node<Object> integerNode = new Node<>(2021, null);
        Integer data3 = (Integer) integerNode.getData();
        Node<Integer> integerNode1 = new Node<>(2021, null);
        Integer data4 = integerNode1.getData();

        HashMap<String, List<Integer>> map = new HashMap<>();
//        HashMap<String, List<Integer>> map = new HashMap<String,<>>(); // Error!
        HashMap<String, List<Integer>> map2 = new HashMap<String, List<Integer>>();

        Node<String> rawNode = new Node("Hi", null); // Unchecked conversion warning!

        //anonymous class
        new Node<>("Hi", null) {/* ... */}; // Parameterized type: Node<String>
        new Node("Hi", null)   {/* ... */}; // Raw type: Node
    }
}