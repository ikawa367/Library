public class Employee extends Person {
    private int salary = 0;

    public Employee(String fname, String lname, String code) {
        super(fname, lname, code);
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

}
