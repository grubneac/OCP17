package serialization;

import java.io.Serial;
import java.io.Serializable;

// Original version of the Item class.
public class Item implements Serializable {                            // (1)
    @Serial
    private static final long serialVersionUID = 1000L;                          // (1a)

    private final double price;

    public Item(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Price: %.2f%n", this.price);
    }
}

// New version of the Item class.
/*public class Item implements Serializable {                            // (2)
    static final long serialVersionUID = 1000L;                          // (2a)
//static final long serialVersionUID = 1001L;                          // (2b)

    private double price;
    private double weight;
    public Item(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return String.format("Price: %.2f, Weight: %.2f", this.price, this.weight);
    }
}*/
