public class Member extends Person {
    private Book faveBook;

    public Member(String fname, String lname, String icode) {
        super(fname, lname, icode);
    }

    public void setFaveBook(Book favorite) {
        faveBook = favorite;
    }

    public Book getFaveBook() {
        return faveBook;
    }

    @Override
    public String toString() {
        return (super.toString() + " name of the favorite book is: " + getFaveBook().getName());
    }
}