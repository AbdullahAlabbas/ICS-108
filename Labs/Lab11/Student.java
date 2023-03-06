package Labs.Lab11;
public class Student {
    private String id , name , phoneNumber;
    private double gpa;

    Student(String id , String name , String phoneNumber , double gpa){
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.gpa = gpa;
    }

    public double getGpa(){
        return this.gpa;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + " Name: " + this.name + " Phone Number: " + phoneNumber + " GPA: " + this.gpa;
    }
}
