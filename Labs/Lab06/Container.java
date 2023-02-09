package Labs.Lab06;
import java.util.ArrayList;

public class Container {
    ArrayList<Integer> ArrayofObjects = new ArrayList<Integer>();
    int maxWeight;
    int currentTotalWeight = 0;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        
    }

    public boolean addItem(int itemWeight) {

        if (currentTotalWeight + itemWeight <= maxWeight) {
            ArrayofObjects.add(itemWeight);
            currentTotalWeight+=itemWeight;
            return true;
        }
        return false;
    }
}