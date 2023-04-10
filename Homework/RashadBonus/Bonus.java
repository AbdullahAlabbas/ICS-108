package Homework.RashadBonus;
import java.util.ArrayList;
import java.util.Arrays;

public class Bonus{
    public static void main(String[] args) {
        Integer[] x = {1, 2, 3, 4, 5};
    
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(x));
        ArrayList<Integer> b = new ArrayList<>();
        reverseArrayList(a,b);
        System.out.println(b);
    }
    public static void reverseArrayList(ArrayList<Integer> list, ArrayList<Integer> newList) {
        if (list.size() == 0) {
            return;
        }
        Integer lastElement = list.remove(list.size() - 1);
        newList.add(lastElement);
        reverseArrayList(list, newList);
    }
    }
