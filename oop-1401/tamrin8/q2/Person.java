
public class Person implements CanThink, Nameable {
    private int age;
    private String name;

    Person() {
    }

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void talk() {
        System.out.println(" I am a person and I'm talking.");
    }

    public void think() {
        System.out.println(" I am a person and I'm thinking.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
