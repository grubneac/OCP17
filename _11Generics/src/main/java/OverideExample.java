import java.util.Arrays;
import java.util.List;

class Ingredient { }

interface PizzaBakeable {
    void bake(List<Ingredient> ingredients);  // (1) After type erasure: bake(List)
}

interface CalzoneBakeable {
    void bake(List<Ingredient> ingredients);  // (2) After type erasure: bake(List)
}

interface SimplyBakeable {
    void bake(List ingredients);              // (3) Signature: bake(List)
}

interface Bakeable extends SimplyBakeable, PizzaBakeable, CalzoneBakeable {
    @Override void bake(List ingredients);    // Can be omitted.
}
public class  OverideExample implements Bakeable{
    @Override
    public void bake(List ingredients) {

    }

    public static void main(String[] args) {
        Object obj = null;
//        boolean isIntStack = obj instanceof MyStack<Integer>; // (1) Compile-time error!

        IStack<Integer> iStack = new MyStack<>();
        boolean isIntegerStack = iStack instanceof MyStack<Integer>;   // (2) OK.
        isIntegerStack = iStack instanceof MyStack;   // (2') OK.
//        boolean isTStack = obj instanceof MyStack<T>;         // (4) Compile-time error!


        Node<Number> numNode = new Node<>(20, null);       // (1)
        Node<?> anyNode = numNode;                         // (2)
        Node<String> strNode = (Node<String>) anyNode;     // (3) Unchecked cast warning
        strNode.setData("Peekaboo");                       // (4)
//        Number num = numNode.getData();                    // (5) ClassCastException

        List<?>[] list4 = {Arrays.asList("one", "two"), Arrays.asList("three", "four")};
        List<?>[] list5 = new List<?>[] {Arrays.asList(20.20, 60.60), Arrays.asList(1978, 1981)};
        List[] list6 = list5;
        Arrays.stream(list6).forEach(System.out::println);
    }

//    @SuppressWarnings("unchecked")         // (1) Suppress warnings at (4),(6),(7).
    public static void castaway() {
        Object obj = new Node<>("one", null);              // (2)
//        Node<String> node1 = obj;                          // (3) Compile-time error!
        Node<String> node2 = (Node<String>) obj;           // (4) Unchecked cast
//        Node<String> node3 = (Node<?>) obj;                // (5) Compile-time error!
        Node<String> node4 = (Node<String>)(Node<?>) obj;  // (6) Unchecked cast
        Node<String> node5 = (Node) obj;                   // (7) Unchecked conversion
        Node<?> node6 = (Node) obj;                        // (8) OK.
        Node<?> node7 = (Node<?>)obj;                      // (9) OK.
    }


}
