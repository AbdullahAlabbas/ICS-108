package PracticeProblems;
import java.util.Scanner;

public class HighestScore 
{

    public static void main(String[] args) 
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        String highestName = "";
        int highestScore = 0;

        for (int i = 0; i < numStudents; i++) 
        {
            System.out.print("Enter student name: ");
            String name = input.next();

            System.out.print("Enter student score: ");
            int score = input.nextInt();

            if (score > highestScore) 
            {
                highestName = name;
                highestScore = score;
            }
        }

        System.out.println("The student with the highest score is " + highestName + " with a score of " + highestScore);
        input.close();
    }
}
