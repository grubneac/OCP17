package review_question;

public class RQ54 {
    public static void main(String[] args) {
        Product p = new Product(101, "Tea", 1.99);
        System.out.println(p);
    }
}

record Product(int id, String name, double price) {
    public String name() {
        return name.toUpperCase();
    }
    public String toString(){
        return "Product[id="+id+", name="+name()+", price="+price+"]";
    }
}