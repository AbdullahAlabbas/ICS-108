package PracticeProblems;
import java.util.Scanner;

public class ExamScore 
{
    public static void main(String[] args) 
    {    
        int score;
        Scanner input = new Scanner(System.in);

        while (true)
        {
            System.out.print("Enter your score: ");
            score = input.nextInt();

            if(score >= 60)
            System.out.println("you pass the exam.");
            else if(score >= 0 && score < 60)
            System.out.println("you don't pass the exam.");
            else if (score == -1)
            {
                System.out.println("Program Terminated");
                break;
            }
        }
        input.close();
    }    
}
