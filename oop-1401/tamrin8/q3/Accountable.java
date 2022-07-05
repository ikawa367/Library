interface Accountable {
    void setAccount(String username, String pass, AccountType type);
    boolean changeAccountPassword(String lastPass, String newPass);
}
