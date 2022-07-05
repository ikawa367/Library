public class Student extends Member implements Identifiable{
    private char[] studentID;
    private String degree;

    public Student(String fname, String lname, String code, char[] studentid) {
        super(fname, lname, code);
        this.setStudentID(studentid);
        this.setMemberID(studentid);
        this.setMembersAcctype(AccountType.TheMember);
    }

    public void setStudentID(char[] input) {
        this.studentID = input;
    }

    public char[] getStudentID() {
        return this.studentID;
    }


    public void setDegree(String input) {
        this.degree = input;
    }

    public String getDegree() {
        return degree;
    }

    

    @Override
    public String toString() {
        return (super.toString());
    }

    @Override
    public void SetID(char[] input) {
        setStudentID(input);
    }

    @Override
    public char[] GetID() {
        return studentID;
    }
}
