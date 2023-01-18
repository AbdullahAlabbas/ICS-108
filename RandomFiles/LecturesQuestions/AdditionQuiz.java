package RandomFiles.LecturesQuestions;
import java.util.Scanner;

public class AdditionQuiz 
{
    public static void main(String[] args) 
    {
        int userAns,x,y,z;
        Scanner input = new Scanner(System.in);

        while (true)
        {
            x = (int) (Math.random() * 10);
            y = (int) (Math.random() * 10);
            z = x + y;
            System.out.printf("%s %d %s %d %s","What is ",x," + ",y,"? ");
            userAns = input.nextInt();

            if(userAns == z)
            {
                System.out.println("You got it!");
                break;
            }


            
        }
        input.close();
    }    
}
