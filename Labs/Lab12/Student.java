package Labs.Lab12;
public abstract class Student {
    private int id;
    private double gpa;

    public Student(int id, double gpa) {
        this.id = id;
        this.gpa = gpa;}

    public abstract String getStatus();

    @Override
    public final String toString() {return "Id: " + id + ", GPA: " + gpa + ", Status: " + getStatus(); }

    public int getId() {return id;}

    public void setId(int id)  {this.id = id;}

    public double getGpa() {return gpa;}

    public void setGpa(double gpa) {this.gpa = gpa;}}