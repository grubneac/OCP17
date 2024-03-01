package sealed;

public abstract sealed class Book permits Audiobook, Ebook, PrintedBook {
    private String isbn;
    protected Book(String isbn) {
        this.isbn = isbn;
    }
    public String getIsbn() { return this.isbn; }
}
