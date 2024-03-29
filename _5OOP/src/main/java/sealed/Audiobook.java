package sealed;

public non-sealed class Audiobook extends Book implements Subscribable {
    private String narrator;
    private double length;
    public Audiobook(String isbn, String narrator, double length) {
        super(isbn);
        this.narrator = narrator;
        this.length = length;
    }
    public String getNarrator() { return this.narrator; }
    public double getLength() { return this.length; }
}
