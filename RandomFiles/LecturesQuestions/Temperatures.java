package RandomFiles.LecturesQuestions;
import java.util.Scanner;

public class Temperatures 
{
    public static void main(String[] args) 
    {
        double celsius,fahrenheit;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Fahrenheit: ");
        fahrenheit = input.nextDouble();

        celsius = (5.0/9) * (fahrenheit - 32);
        System.out.printf("%s %.2f %s %.2f %s","Fahrenheit" , fahrenheit , "is" , celsius , "in Celsius");

        input.close();

    }    
}
