package Homework.Assignment1;
import java.util.Scanner;

public class AssignmentOneP3 
{
    public static void main(String[] args)
    {
        // Create an input from the Scanner class
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a string followed by a character: ");
        // first we will take the String wich is name
        String name = input.next();
        // then we will take the char wich is the number of occurrences
        char occurrences = input.next().charAt(0);

        System.out.println("The number of occurrences: " + count(name,occurrences));
        // close the input 
        input.close(); 
    }   
    public static int count(String str, char a) 
    {
        int count = 0;
        // to check every letter
        for (int i = 0; i < str.length(); i++) 
        {
            if (str.charAt(i) == a) 
            {
                count++;
            }
        }
        return count;
    }
     
}
