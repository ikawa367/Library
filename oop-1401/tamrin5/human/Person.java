package human;
import java.time.LocalDate;
import java.util.Scanner;

import utility.*;

public class Person {
    private String firstName;
    private String lastName;
    private final char[] nationalCode;
    private final Gender sex;
    private LocalDate birthday;
    private String phone;
    private Adress adress;
    public Person(String firstN,String lastN,char[] code,Gender gender){
        setFirstName(firstN);
        setLastName(lastN);
        this.sex = gender;
        if(code.length != 10)
        {
            System.out.println("invalid code");
            this.nationalCode = null;
        }
        else{
            this.nationalCode = code;
        }
    }
    public String showName()
    {
        return (firstName+" "+lastName);
    }
    public int getAge()
    {
        LocalDate now = LocalDate.now();
        return (birthday.getYear() - now.getYear());
    }
    public void setBirthday(LocalDate birth)
    {
        LocalDate now = LocalDate.now();
        int age = (birth.getYear() - now.getYear());
        if(age <= 0 || age > 100)
        {
            System.out.println("invalid age");
        }
        else{
            birthday = birth;
        }
        
    }
    public LocalDate getBitrhday()
    {
        return birthday;
    }
    public void setFirstName(String name)
    {
        firstName = name;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setLastName(String name)
    {
        lastName = name;
    }
    public String getLastName()
    {
        return lastName;
    }
    public Gender getSex()
    {
        return sex;
    }
    public void setPhone(String input)
    {
        phone = input;
    }
    public String getPhone()
    {
        return phone;
    }
    public void setAdress(Adress input)
    {
        adress = input;
    }
    public Adress getAdress()
    {
        return adress;
    }
    public char[] getNationalCode()
    {
        return nationalCode;
    }
    public String toString(){
        String s;
        s = (firstName+"  " + lastName + " " + String.valueOf(nationalCode) );
        return s;
    }
    
    public boolean equals (Person input){
        
        if(this.firstName.equals(input.firstName) && this.lastName.equals(input.lastName) && this.sex.equals(input.sex) && this.nationalCode.equals(input.nationalCode)){
            return true;
        }
        return false;
    }


    // public static void main(String[] args){

    //     Scanner scan = new Scanner(System.in);

    //     String name, lastName , phone , genderFinder;
        
    //     Gender sex;
    //     System.out.println("Enter name");
    //     name = scan.nextLine();
    //     System.out.println("Enter last name");
    //     lastName = scan.nextLine();
    //     System.out.println("Enter Gender FEMALE or MALE");
    //     genderFinder = scan.nextLine();
    //     System.out.println("Enter ID");
    //     String id = scan.nextLine();
    //     char[] ch = new char[id.length()];
    //     for(int i = 0; i < id.length(); i++)
    //     {
    //         ch[i] = id.charAt(i);
    //     }
    //     if (genderFinder.equals("FEMALE")){
    //         sex = Gender.FEMALE;
    //         Person p = new Person(name, lastName, ch, sex);
    //         Person p2 = new Person(name, " zk", ch, sex);
    //         System.out.println(p.toString());
    //         System.out.println(p2.toString());
    //         System.out.println(p.equals(p2));
        
    //     }
    //     if (genderFinder.equals("MALE")){
            
    //         Person p = new Person(name, lastName, ch, Gender.MALE);
    //         Person p2 = new Person(name, lastName, ch, Gender.MALE);
    //         System.out.println(p.toString());
    //         System.out.println(p2.toString());
    //         System.out.println(p.equals(p2));
    //     }
    // }
}
