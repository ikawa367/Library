import utility.*;

public class Member extends Person implements CanTakeBook, CanReturnBook, Accountable {
    private Book faveBook;
    private Book[] takenBooks;
    private int numberOfBooks = 0;
    private Account account = null;
    private char[] memberID;
    private AccountType accType;

    public void setMembersAcctype(AccountType input) {
        this.accType = input;
    }

    public void setMemberID(char[] id) {
        this.memberID = id;
    }

    public Member(String fname, String lname, String icode) {
        super(fname, lname, icode);
    }

    public void setFaveBook(Book favorite) {
        faveBook = favorite;
    }

    public Book getFaveBook() {
        return faveBook;
    }

    public int getnumberOfBooks() {
        return numberOfBooks;
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return (super.toString() + " name of the favorite book is: " + getFaveBook().getName());
    }

    @Override
    public boolean addTakenBooks(Book input) {
        if (input.getBookSituation() == BookState.AVAILABLE) {
            input.lend();
            numberOfBooks++;
            takenBooks[numberOfBooks] = input;
            return true;
        } else {
            System.out.println("book is not available");
            return false;
        }
    }

    public static Book[] removeTheElement(Book[] arr, int index) {
        if (arr == null || index < 0
                || index >= arr.length) {

            return arr;
        }
        Book[] anotherArray = new Book[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {

            if (i == index) {
                continue;
            }

            anotherArray[k++] = arr[i];
        }

        return anotherArray;
    }

    @Override
    public boolean returnTakenBook(Book input) {
        for (int i = 0; i <= numberOfBooks; i++) {
            if (takenBooks[i].equals(input)) {
                this.takenBooks = removeTheElement(takenBooks, i);
                input.takeBack();
                numberOfBooks--;
                return true;
            }
        }
        return false;
    }

    public void setAccount() {
        String u = this.getNationalCode();
        String s = String.valueOf(this.memberID);
        Account temp = new Account(u, s, accType);
        account = temp;
    }

    @Override
    public void setAccount(String username, String pass, AccountType type) {
        Account acc = new Account(username, pass, type);
        account = acc;
    }

    @Override
    public boolean changeAccountPassword(String lastPass, String newPass) {
        if (account.getPassword().equals(lastPass)) {
            account.setPassword(newPass);
            return true;
        }
        return false;
    }

}