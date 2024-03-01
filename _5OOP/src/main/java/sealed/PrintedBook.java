package sealed;

public final class PrintedBook extends Book {
    private int pageCount;
    protected PrintedBook(String isbn, int pageCount) {
        super(isbn);
        this.pageCount = pageCount;
    }
    public int getPageCount() { return this.pageCount; }
}
