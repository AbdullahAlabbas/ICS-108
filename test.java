import java.util.Scanner;

public class test 
{
    public static void main(String[] args) 
    {
        System.out.println("Enrer num");

        Scanner input = new Scanner(System.in);
        int i = input.nextInt();

        System.out.println(i);

        input.close();
    }
}
