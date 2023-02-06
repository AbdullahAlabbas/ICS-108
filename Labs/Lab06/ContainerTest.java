package Labs.Lab06;
import java.util.Scanner;

public class ContainerTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Container container = new Container(10);

        while (true) {
            System.out.print("Enter the weight of an item: ");
            int itemWeight = input.nextInt();
    
            if (!container.addItem(itemWeight)) {
                System.out.println("Item is too heavy. Container is full.");
                break;
            }
        }

        input.close();

        System.out.println("Contents of the container: " + container.items);



    }
}