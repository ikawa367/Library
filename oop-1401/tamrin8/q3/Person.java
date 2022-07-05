import java.time.LocalDate;
//import java.util.Scanner;

import utility.*;

public class Person implements Nameable{
    private String name; //az tamrin ghabl first name va last name ro dashtim.
    private String firstName;
    private String lastName;
    private final String nationalCode;
    private Gender sex;
    private LocalDate birthday;
    private String phone;
    private Adress adress;

    public Person(String firstN, String lastN, String code) {
        setFirstName(firstN);
        setLastName(lastN);
        name = firstN + " " + lastN;
        if (code.length() != 10) {
            System.out.println("invalid code");
            this.nationalCode = null;
        } else {
            this.nationalCode = code;
        }
    }

    @Override
    public void SetName(String input) {
        name = input;
    }
    @Override
    public String GetName() {
        return name;
    }

    public String showName() {
        return (firstName + " " + lastName);
    }

    public int getAge() {
        LocalDate now = LocalDate.now();
        return (birthday.getYear() - now.getYear());
    }

    public void setBirthday(LocalDate birth) {
        LocalDate now = LocalDate.now();
        int age = (birth.getYear() - now.getYear());
        if (age <= 0 || age > 100) {
            System.out.println("invalid age");
        } else {
            birthday = birth;
        }

    }

    public LocalDate getBitrhday() {
        return birthday;
    }

    public void setFirstName(String name) {
        firstName = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String name) {
        lastName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getSex() {
        return sex;
    }

    public void setPhone(String input) {
        phone = input;
    }

    public String getPhone() {
        return phone;
    }

    public void setAdress(Adress input) {
        adress = input;
    }

    public Adress getAdress() {
        return adress;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public String toString() {
        String s;
        s = (firstName + "  " + lastName + " " + String.valueOf(nationalCode));
        return s;
    }

    public boolean equals(Person input) {

        if (this.firstName.equals(input.firstName) && this.lastName.equals(input.lastName) && this.sex.equals(input.sex)
                && this.nationalCode.equals(input.nationalCode)) {
            return true;
        }
        return false;
    }

}
