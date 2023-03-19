package Labs.Lab16;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortStudents {
    public static void main(String[] args) {
        ArrayList<Integer> studentIds = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("unsortedStudents.txt"));
            while (scanner.hasNextInt()) {
                studentIds.add(scanner.nextInt());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found.");
        }
        
        Collections.sort(studentIds);
        
        try {
            PrintWriter writer = new PrintWriter(new File("sortedStudents.txt"));
            for (int id : studentIds) {
                writer.println(id);
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Output file not found.");
        }
        
        System.out.println("Sorted students written to sortedStudents.txt");
    }
}