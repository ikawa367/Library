import utility.BookState;

public class Student extends Person {
    private char[] studentID;
    private String degree;
    private Book[] takenBooks;
    private int numberOfBooks = 0;

    public Student(String fname, String lname, String code, char[] studentid) {
        super(fname, lname, code);
        this.setStudentID(studentid);
    }

    public void setStudentID(char[] input) {
        this.studentID = input;
    }

    public char[] getStudentID() {
        return this.studentID;
    }

    public int getnumberOfBooks() {
        return numberOfBooks;
    }

    public void setDegree(String input) {
        this.degree = input;
    }

    public String getDegree() {
        return degree;
    }

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

    public static Book[] removeTheElement(Book[] arr, int index)
    {
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

    @Override
    public String toString() {
        return (super.toString());
    }
}
