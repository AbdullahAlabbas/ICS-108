import java.util.Scanner;

public class Lab02Task1
{
    public static void main(String[] args)
    {
        int numberOfStudents;
        double gpa = 0.00;
        double sumOfGrades = 0.00;
        String letterGrade;

        Scanner input = new Scanner(System.in);

        System.out.println("How many students?");
        numberOfStudents = input.nextInt();

        System.out.printf("Enter %d letter grades:\n" , numberOfStudents);
        for(int i = 0; i < numberOfStudents; i++)
        {
            letterGrade = input.next();
            sumOfGrades += letterGrade2Numeric(letterGrade);
        }

        input.close();
        gpa = sumOfGrades / numberOfStudents;
        System.out.printf("GPA = %.2f", gpa);
    }   
    
    public static double letterGrade2Numeric(String grade)
    {
        double numberGrade;

        switch (grade)
        {
            case "A+": numberGrade = 4.00;
            break;

            case "A": numberGrade = 3.75;
            break;

            case "B+": numberGrade = 3.50;
            break;

            case "B": numberGrade = 3.00;
            break;

            case "C+": numberGrade = 2.50;
            break;

            case "C": numberGrade = 2.00;
            break;

            case "D+": numberGrade = 1.50;
            break;

            case "D": numberGrade = 1.00;
            break;

            case "F": numberGrade = 0.00;
            break;

            default : numberGrade = 0.00;
        }

        return numberGrade;
        
    }
}
