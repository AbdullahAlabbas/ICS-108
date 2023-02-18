import java.util.Scanner;

public class Lab01Task1 
{
    public static void main(String[] args)
    {
        double area , lengthOfSide;
        int numberOfSides;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        numberOfSides = input.nextInt();

        System.out.print("Enter the side: ");
        lengthOfSide = input.nextDouble();

        area = (numberOfSides* Math.pow(lengthOfSide,2)) / (4 * Math.tan(Math.PI/numberOfSides));
        System.out.println("The area of the polygon is " + area); 

        input.close();
    }    
}
