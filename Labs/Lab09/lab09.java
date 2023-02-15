package Labs.Lab09;
public class lab09 {
    public static void main(String[] args) {
        Person p1 = new Person("Salem", "0501331845");
        Student s1 = new Student("Reem", "0564448202", 200000, 3.6);
        Employee e1 = new Employee("Saad", "0563428255", 200003, 16000);

        System.out.println(p1.toString());
        System.out.println(s1.toString());
        System.out.println(e1.toString());
    }
}

class Person {
    private String name;
    private String phoneNum;

    Person(String name, String phoneNum){
        this.name = name;
        this.phoneNum = phoneNum;
    }
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name: " + name + " phone number: " + phoneNum;
    }
}

class Student extends Person {
    private int ID;
    private double GPA;

    Student(String name, String phoneNum, int ID, double GPA) {
        super(name, phoneNum);
        this.ID = ID;
        this.GPA = GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return super.toString() + " ID: " + ID + " GPA: " + GPA;
    }
}

class Employee extends Person {
    private int ID;
    private double monthlySalary;

    Employee(String name, String phoneNum, int ID, double monthlySalary) {
        super(name, phoneNum);
        this.ID = ID;
        this.monthlySalary = monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
    @Override
    public String toString() {
        return super.toString() + " ID: " + ID + " monthlySalary: " + monthlySalary + " SAR";
    }
}