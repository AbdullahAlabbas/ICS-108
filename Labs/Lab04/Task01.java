import java.util.ArrayList;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int SIZE, MAX_WEIGHT = 10;
        int counter,total,number;
        ArrayList<Integer> weights = new ArrayList<Integer>();

        System.out.print("Enter the number of the objects: ");
        SIZE = input.nextInt();
        System.out.print("Enter the weight of the objects: ");


        for(int i = 0; i < SIZE ;i++){
            weights.add(input.nextInt());
        }
        input.close();

        counter = 1;

        while(!weights.isEmpty()){
            ArrayList<Integer> objectOfContainer = new ArrayList<Integer>();
            total = 0;

            for(int i = 0; i < weights.size(); i++){
                if((total + weights.get(i)) <= MAX_WEIGHT){
                    number = weights.remove(i);
                    i--;
                    objectOfContainer.add(number);
                    total +=number;
                }
            }

            System.out.println("Container "+counter+" contains object with weight "+ objectOfContainer.toString());

            counter++;
        }
    }
}
