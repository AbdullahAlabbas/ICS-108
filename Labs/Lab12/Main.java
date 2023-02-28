package Labs.Lab12;

public class Main{
    public static void main(String[] args){
        Student[] students = new Student[5];
        students[0] = new Undergraduate(2020, 3.7);
        students[1] = new Undergraduate(2021, 2.5);
        students[2] = new Undergraduate(2019, 1.9);
        students[3] = new Graduate(2017, 3.5);
        students[4] = new Graduate(2018, 2.8);

        for (Student student : students) { System.out.println(student); }}}