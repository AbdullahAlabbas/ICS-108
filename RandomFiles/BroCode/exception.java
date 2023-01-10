package RandomFiles.BroCode;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exception 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        try
        {
            

            System.out.print("Enter a whole number to devide: ");
            int x = scanner.nextInt();

            System.out.print("Enter a whole number to devide by: ");
            int y = scanner.nextInt();

            int z = x/y;

            System.out.println("result: "+ z);
            
        
        }
        catch(ArithmeticException e )
        {
            System.out.println("You can't devide by zero!");
        }
        catch(InputMismatchException e)
        {
            System.out.println("ENTER A NUMBER!!");
        }
        catch(Exception e){
            System.out.println("something went wrong");
        }

        finally
        {
            scanner.close();
        }
    }    
}
