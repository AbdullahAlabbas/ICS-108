package Labs.Lab02;
import java.util.Scanner;

public class Task01 
{
    public static void main(String[] args) 
    {
        int numToRepeat;
        Scanner input = new Scanner(System.in);

        System.out.println("How many letter Grades?");
        numToRepeat = input.nextInt();
        printNRandomLetterGrades(numToRepeat);
        input.close();
    }
    public static void printNRandomLetterGrades(int n)
    {
        int randomNum;
        
        for(int i = 0; i < n; i++)
        {
            randomNum = (int) (1 + Math.random() * 9);
            switch(randomNum)
            {
                case 1 :  System.out.println("A+");
                break;

                case 2 :  System.out.println("A");
                break;

                case 3 : System.out.println("B+");
                break;

                case 4 : System.out.println("B");
                break;

                case 5 : System.out.println("C+");
                break;

                case 6 : System.out.println("C");
                break;

                case 7 : System.out.println("D+");
                break;

                case 8 : System.out.println("D");
                break;

                case 9 : System.out.println("F");
                break;
            }
        }        
    }  
}
