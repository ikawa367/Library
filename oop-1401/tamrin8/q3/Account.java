public class Account {
    private final String userName;
    private String password;
    private final AccountType type;

    public Account(String username, String password, AccountType type) {
        this.userName = username;
        this.password = password;
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }

    public boolean changePassword(String lastPass, String newPass) {
        if (lastPass.equals(password)) {
            password = newPass;
            return true;
        } else {
            return false;
        }
    }
}
