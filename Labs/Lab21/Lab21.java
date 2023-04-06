import java.util.ArrayList;

public class Lab21 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(2);
        System.out.println("Original list: " + list);

        int target = 2;
        remove(list, target);
        System.out.println("List with " + target + " removed: " + list);
    }
    public static void remove(ArrayList<Integer> list, Integer target) {
        if(list.contains(target)){
            list.remove(target);
            remove(list, target); 
        }
    }
    
}
