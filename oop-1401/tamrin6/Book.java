import utility.*;

public class Book {
    private final String name;
    private final String author;
    private String translator;
    private String iSBN;
    final int pages;
    static int maxPages = 99999;
    int price;
    BookState bookSituation = BookState.UNAVAILABLE;

    public Book(String name, String author, int pages) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        if (pages > maxPages) {
            System.out.print("warning: too much pages");
        }
    }

    public Book(String name, String author, int pages, int price, BookState situation) {
        this(name, author, pages);
        this.price = price;
        this.bookSituation = situation;
    }

    public static void setMaxPages(int input) {
        maxPages = input;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    public void setISBN(String iSBN) {
        this.iSBN = iSBN;
    }

    public void setBookSituation(BookState input) {
        this.bookSituation = input;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getTranslator() {
        return translator;
    }

    public String getISBN() {
        return iSBN;
    }

    public int getMaxPage() {
        return maxPages;
    }

    public int getPrice() {
        return price;
    }

    public int getPages() {
        return pages;
    }

    public BookState getBookSituation() {
        return bookSituation;
    }

    public String toString() {
        return name + " by " + author + " " + pages + " pages. situation: " + bookSituation;
    }

    public boolean equals(Book input) {
        if (this.name.equals(input.name) && (this.pages == input.pages) && this.author.equals(input.author)) {
            return true;
        } else {
            return false;
        }
    }

    public void bind() {
        bookSituation = BookState.BINDING;
    }

    public void lend() {
        bookSituation = BookState.UNAVAILABLE;
    }

    public void takeBack() {
        bookSituation = BookState.AVAILABLE;
    }

    public void publish() {
        bookSituation = BookState.AVAILABLE;
    }
}
