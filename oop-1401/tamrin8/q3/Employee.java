public class Employee extends Member implements Identifiable {
    private int salary = 0;
    private char[] employeeCode;

    public Employee(String fname, String lname, String code, char[] eCode) {
        super(fname, lname, code);
        this.employeeCode = eCode;
        this.setMemberID(eCode);
        this.setMembersAcctype(AccountType.TheEmployee);
    }

    public void setSalary(int input) {
        salary = input;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return (super.toString() + " salary is: " + getSalary());
    }

    @Override
    public void SetID(char[] input) {
        employeeCode = input;
    }

    @Override
    public char[] GetID() {
        return employeeCode;
    }

}
