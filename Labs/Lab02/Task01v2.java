package Labs.Lab02;
import java.util.Random;
import java.util.Scanner;

public class Task01v2 
{
    public static void main(String[] args) 
    {
     int n;
     Scanner input = new Scanner(System.in);
     n = input.nextInt();
     printNRandomLetterGrades(n);
     input.close();
    }
    public static void printNRandomLetterGrades(int n) 
    {
        Random rand = new Random();
        String[] letterGrades = {"A+", "A", "B+", "B", "C+", "C", "D+", "D", "F"};
    
        for (int i = 0; i < n; i++) 
        {
            int randomIndex = rand.nextInt(letterGrades.length);
            System.out.println(letterGrades[randomIndex]);
        }
    }
    
}

