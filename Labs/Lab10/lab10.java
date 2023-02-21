package Labs.Lab10;
import java.util.ArrayList;

public class lab10 {
    public static void main(String[] args) {
        ArrayList<Person> personList = createPersonList();
//1. This method prints the employees only
        printEmployees(personList);
//2. This method finds the average salary of employees
        double avgSalary = avgSalary(personList);
        System.out.println("avg salary of = " + avgSalary);
//3. This method prints the students only
        printStudents(personList);
//4. This method finds the average GPA of students
        double avgGpa = avgGpa(personList);
        System.out.println("avg GPA of students = " + avgGpa);
    }

    private static ArrayList<Person> createPersonList() {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Employee("Saad", "0563428255", 200003, 16000));
        personList.add(new Student("Reem", "0564448202", 20000, 3.6));
        personList.add(new Employee("Salem", "0501331845", 200001, 9000));
        personList.add(new Student("Hasan", "0594448202", 20002, 2.8));
        return personList;
    }

    public static void printEmployees(ArrayList<Person> person){
        System.out.println("List of Employees\n" +"Name    Phone      ID     Salary");
        for(Person i : person) if(i instanceof Employee) System.out.println(i);
    }
    public static void printStudents(ArrayList<Person> person){
        System.out.println("List of Students\n" + "Name    Phone           ID      GPA");
        for(Person i : person) if(i instanceof Student) System.out.println(i);
    }
    public static double avgSalary(ArrayList<Person> person){
        int sum = 0;
        int counter = 0;

        for(Person i : person) {
            if ((i instanceof Employee)) {
                sum += ((Employee) i).getSalary();
                counter ++;
            }
        }
        return sum / counter;
    }
    public static double avgGpa(ArrayList<Person> person){
        double sum = 0;
        int counter = 0;

        for(Person i : person) {
            if ((i instanceof Student)) {
                sum += ((Student) i).getGpa();
                counter ++;
            }
        }
        return sum / counter;
    }
}