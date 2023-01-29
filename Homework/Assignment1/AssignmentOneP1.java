package Homework.Assignment1;
public class AssignmentOneP1 
{
    public static void main(String[] args) 
    {
        System.out.println("The numbers from 100 to 200 divisible by 3 or 4, but not both are:");

        // the range
        for (int i = 100; i <= 200; i++) 
        {
            // to chech if the numbers divisible by 3 or 4, but not both
            if ((i % 3 == 0 || i % 4 == 0) && !(i % 3 == 0 && i % 4 == 0)) 
            {
                // i will but a space after every number instead of a new line
                System.out.print(i + " ");
            }
        }
    }    
}
