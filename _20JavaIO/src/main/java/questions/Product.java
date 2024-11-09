package questions;

import java.io.Serializable;
public class Product implements Serializable {
    private String name;

    public Product(String name) {
        this.name = name;
        System.out.print("product ");
    }

    @Override
    public String toString() {
        return name;
    }
}