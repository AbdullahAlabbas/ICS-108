import java.util.Scanner;

public class Lab01Task2 
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
        
            if (letterGrade.equals("A+"))
            sumOfGrades += 4.00;
            
            else if(letterGrade.equals("A"))
            sumOfGrades += 3.75;

            else if(letterGrade.equals("B+"))
            sumOfGrades +=3.50;

            else if(letterGrade.equals("B"))
            sumOfGrades += 3.00;

            else if(letterGrade.equals("C+"))
            sumOfGrades += 2.50;

            else if(letterGrade.equals("C"))
            sumOfGrades += 2.00;

            else if(letterGrade.equals("D+"))
            sumOfGrades += 1.50;

            else if(letterGrade.equals("D"))
            sumOfGrades +=1.00;

            else if(letterGrade.equals("F"))
            sumOfGrades +=0.00;

            else
            {
                System.out.println("Invalid Letter");
            }
        }

        input.close();
        gpa = sumOfGrades / numberOfStudents;
        System.out.printf("GPA = %.2f", gpa);
    }    
}
