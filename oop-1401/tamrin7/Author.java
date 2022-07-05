import java.util.Locale.Category;

public class Author extends Person {
    private String email;
    private Category writingStyle;

    public Author(String Fname, String Lname) {
        super(Fname, Lname, "1234567890");
    }

    public Author(String Fname, String Lname, String code) {
        super(Fname, Lname, code);
    }

    public Author(String Fname, String Lname, String code, String mail) {
        this(Fname, Lname, code);
        this.setEmail(mail);
    }

    public void setEmail(String input) {
        this.email = input;
    }

    public String getEmail() {
        return email;
    }

    public void setWritingStyle(Category input) {
        this.writingStyle = input;
    }

    public Category getWritingStyle() {
        return writingStyle;
    }

    @Override
    public String toString() {
        // we could also use toString method from the super class Person:
        // super.toString();

        return ("Name of the Author: " + this.getFirstName() + "  " + this.getLastName() + " national code is: "
                + this.getNationalCode());
    }
}
