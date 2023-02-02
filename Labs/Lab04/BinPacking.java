package Labs.Lab04;
import java.util.Scanner;

public class BinPacking {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the total number of objects: ");
            int numObjects = sc.nextInt();

            int[] weights = new int[numObjects];

            System.out.println("Enter the weight of each object: ");
            for (int i = 0; i < numObjects; i++) {
                weights[i] = sc.nextInt();
            }

            // Calculate the total number of containers needed to pack the objects
            int numContainers = 0;
            int currentWeight = 0;
            for (int i = 0; i < numObjects; i++) {
                if (currentWeight + weights[i] > 10) { // if adding this object would exceed 10 kg, start a new container 
                    numContainers++; 
                    currentWeight = 0; // reset the current weight to 0 
                } 

                currentWeight += weights[i]; // add the weight of this object to the current weight 
            } 

            // If there are still objects left in the last container, add one more container 
            if (currentWeight > 0) { 
                numContainers++; 
            }

            System.out.println("Total number of containers needed: " + numContainers);

             // Print out the contents of each container 
             int containerNum = 1; 
             currentWeight = 0;  

             System.out.println("Contents of each container:");  

             for (int i=0; i<numObjects; i++) {  

                 if (currentWeight + weights[i] > 10) {   // if adding this object would exceed 10 kg, start a new container  

                     System.out.println("Container " + containerNum + ": ");  

                     containerNum++;  

                     currentWeight = 0; // reset the current weight to 0  

                 }  

                 System.out.print(weights[i] + "kg ");    // print out the weight of this object   

                 currentWeight += weights[i];    // add the weight of this object to the current weight   

             }
        }

        System.out.println();    // print a new line at the end                 
         }     }