import java.util.Scanner;

public class Test 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        int x = scanner.nextInt();

        System.out.print("y: ");
        int y = scanner.nextInt();

        int z =x + y;
        System.out.println(z);

        scanner.close();
    }
}
