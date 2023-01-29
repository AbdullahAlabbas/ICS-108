package Homework.Assignment1;
import java.util.Scanner;

public class AssignmentOneP2 
{
    public static void main(String[] args) 
    {
        // create an input from the scanner class
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to computes the sum: ");
        long num = input.nextLong();
        System.out.print("The sum of the digits : " + sumDigits(num));
        // close the input class
        input.close();
    }
    public static int sumDigits(long n) 
    {
        int sum = 0;

        while (n > 0) 
        {
            // sum = sum + n % 10
            sum += n % 10;
            // n =  n / 10
            n /= 10;
        }
        return sum;
    }
}
