package sealed;

public sealed class Ebook extends Book implements Subscribable permits SuperEbook{
    private String format;
    public Ebook(String isbn, String format) {
        super(isbn);
        this.format = format;
    }
    public String getFormat() { return this.format; }
}
