public class Librarian extends Person implements Accountable {
    private int activeYears;
    private Account account = null;

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

    public Account getAccount() {
        return account;
    }

    public void setAccount(String username, String pass) {
        Account acc = new Account(username, pass, AccountType.TheLibrarian);
        account = acc;
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
