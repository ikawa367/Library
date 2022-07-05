public class Librarian extends Person {
    private int activeYears;

    public Librarian(String fname, String lname, String icode) {
        super(fname, lname, icode);
        activeYears = 0;
    }

    public void setActiveYears(int input) {
        activeYears = input;
    }

    public int getActiveYears() {
        return activeYears;
    }
}
