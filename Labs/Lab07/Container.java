package Labs.Lab07;
import java.util.ArrayList;

class Container {
    ArrayList<Integer> items = new ArrayList<>();
    int maximumWeight;
    Container(int maximumWeight){
        this.maximumWeight = maximumWeight;
    }

    public boolean addItem(int itemWeight){

        if(itemWeight <= maximumWeight){
            maximumWeight -= itemWeight;
            items.add(itemWeight);
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getContents(){
        return items;
    }
}