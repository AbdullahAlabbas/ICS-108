import java.util.Scanner;

public class Lab04Task1 {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int arraySize = input.nextInt();

        int[] array = new int[arraySize];
        System.out.print("Enter the contents of the array: ");

        for (int i = 0; i < arraySize; i++) 
        {
            array[i] = input.nextInt();
        }

        System.out.printf("The array has %d integers:", arraySize);
        for (int i = 0; i < arraySize; i++) 
        {
            System.out.print(" " + array[i]);
        }

        boolean sorted = Lab04Task1.isSorted(array);

        if (sorted)
            System.out.println("\nThe array is sorted");
        else
            System.out.println("\nThe array is not sorted");

        input.close();
    }
    public static boolean isSorted(int[] array)
    {
        for (int i = 0; i < array.length; i++) 
        {
            if (!(array[i] <= array[i - 1])) {
                return false;
            }
        }
        return true;
    }
}