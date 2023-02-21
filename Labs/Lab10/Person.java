package Labs.Lab10;

public class Person {
    private String name, phone;

    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name + "\t" + phone;
    }
}