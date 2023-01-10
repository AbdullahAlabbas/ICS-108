// import java.util.Scanner;

// public class Lab07Task1 {
//     public static void main(String[] args) throws Exception {
//         int sideNumbers;
//         double x, y, perimeter;
//         Point[] points;
//         Scanner input = new Scanner(System.in);

//         System.out.print("Enter number of sides: ");
//         sideNumbers = input.nextInt();

//         points = new Point[sideNumbers];
//         for (int i = 0; i < sideNumbers; i++) {
//             System.out.printf("Enter point %d: (x, y): ", i + 1);
//             x = input.nextDouble();
//             y = input.nextDouble();
//             points[i] = new Point(x, y);
//         }

//         perimeter = 0;
//         for (int i = 0; i < sideNumbers; i++) {
//             perimeter += points[i].distance(points[(i + 1) % sideNumbers]);
//         }

//         System.out.println(perimeter);
//         input.close();
//     }
// }