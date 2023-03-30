package Labs.Lab20;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab20 {
  
  
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a list of integers: ");
    String[] elements = input.nextLine().split(" ");
    
    for (String element : elements) list.add(Integer.parseInt(element));
    
    int largest = findLargest(list);
    System.out.println("The largest element in the list is: " + largest);

    
  } // end of main method

  public static int findLargest(ArrayList<Integer> list) {
    if (list.size() == 1) return list.get(0);
    
    else {
      int first = list.get(0);
      ArrayList<Integer> rest = new ArrayList<>(list.subList(1, list.size()));
      int maxRest = findLargest(rest);
      return (first > maxRest) ? first : maxRest;}}
  
} // end of class

