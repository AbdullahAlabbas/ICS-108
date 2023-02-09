package Labs.Lab07;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of objects: ");
        int objectsNum = input.nextInt();
        ArrayList<Integer> weight = new ArrayList<>();

        System.out.print("Enter the weights of the objects: ");
        for (int i = 0; i < objectsNum; i++) weight.add(input.nextInt());

        ArrayList<ArrayList<Integer>> result = arrayOfContainers(weight, objectsNum);

        for(int i = 0; i < result.size(); i++){

            System.out.println("Container " + i + " contains objects with weights " + result.get(i));
        }
    }
    public static ArrayList<ArrayList<Integer>> arrayOfContainers(ArrayList<Integer> weight, int objectsNum) {
        final int MAX_WEIGHT = 10;

        Container[] containers = new Container[objectsNum];
        for (int i = 0; i < objectsNum; i++) {
            containers[i] = new Container(MAX_WEIGHT);
        }

        while(!weight.isEmpty()){

            for(int i = 0; i < objectsNum; i++) {
                for(int j = 0; j < weight.size(); j++) {
                    if(containers[i].addItem(weight.get(j))){
                        weight.remove(j);
                        j--;
                    }
                }
            }
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for(int i = 0; i < objectsNum; i++) {
            if(!containers[i].getContents().isEmpty()){
                result.add(containers[i].getContents());
            }
        }
        return result;
    }
}