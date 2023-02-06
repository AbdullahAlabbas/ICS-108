package Labs.Lab06;
import java.util.ArrayList;



public class Container {
    ArrayList<Integer> items = new ArrayList<Integer>();
    int maxWeight;
    int currentTotalWeight = 0;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        
    }

    public boolean addItem(int itemWeight) {

        if (currentTotalWeight + itemWeight <= maxWeight) {
            items.add(itemWeight);
            currentTotalWeight+=itemWeight;
            return true;
        }
        return false;
    }



}