package BroCode;

import java.util.Scanner;

public class nested 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int colm;
        String symbol = "";
        
        System.out.println("Enter number of rows: ");
        rows = scanner.nextInt();

        System.out.println("Enter number of columns: ");
        colm = scanner.nextInt();

        System.out.println("Enter symbol to use: ");
        symbol = scanner.next();

        for(int i =1; i <= rows; i++)
        {
            System.out.println();
            for(int j =1; j <= colm; j++)
            {
                System.out.print(symbol);
            }
        }
    scanner.close();
    }    
}
