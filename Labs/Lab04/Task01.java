package Labs.Lab04;
import java.util.ArrayList;
import java.util.Scanner;

public class Task01 
{
        public static void main(String[] args)
        {

        ArrayList<Integer> theObjects = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of objects: ");
        int numOfObjects = input.nextInt();

        System.out.print("Enter the weights of the objects: ");
        for(int i = 0 ; i < numOfObjects ;i++)
        {
            theObjects.add(input.nextInt());
        }
        input.close();

        container(theObjects);

        }
        public static void container(ArrayList<Integer> theObjects)
        {
            int maxWeight = 0;  

            System.out.print("The container contains ");
            for(int i = 0; i < theObjects.size() ;i++)
            {
                if(maxWeight + theObjects.get(i)  < 10)
                {
                    maxWeight += theObjects.get(i);
                    System.out.print(theObjects.get(i) + " ");
                }

                else
                {

                }
    
            }

        }

}



