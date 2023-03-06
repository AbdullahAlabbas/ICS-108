package Labs.Lab14;
import java.util.Arrays;

public class TestPoint {

  public static void main(String[] args) {

      // Create an array of random points
      Point[] points = new Point[4];
      for (int i = 0; i < points.length; i++) {
          points[i] = new Point((int)(Math.random()*10), (int)(Math.random()*10));
      }

      // Display the array
      System.out.println("Unsorted Array:");
      for (Point p : points) {
          System.out.println(p);
      }

      // Sort the array
      Arrays.sort(points);

      // Display the sorted array
      System.out.println("Sorted Array:");
      for (Point p : points) {
          System.out.println(p);
      }
  }
}