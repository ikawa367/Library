public class Student extends Person {

    private String studentID;

    Student() {
    }

    Student(String ID) {
        this.studentID = ID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void talk() {
        System.out.println(" I am a Student and I'm talking.");
    }

    public void think() {
        System.out.println(" I am a Student and I'm thinking.");
    }

}
