package BroCode;

import java.util.Scanner;

public class logic 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press q to quit");
        String respone = scanner.next();

        if (respone.equals("q") || respone.equals("Q"))
        {
            System.out.println("Bey");
        }
        else
        {
            System.out.println("Not bey");
        }
        scanner.close();
    }    
}
