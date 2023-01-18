import java.util.Scanner;
 
public class Test {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter the number of courses: ");
        int numCourses = input.nextInt();
 
        int totalCreditHours = 0;
        double totalGradePoints = 0;
 
        for (int i = 0; i < numCourses; i++) {
            System.out.print("Enter the letter grade for course " + (i+1) + ": ");
            String letterGrade = input.next();

            System.out.print("Enter the credit hours for course " + (i+1) + ": ");            
             int creditHours = input.nextInt();

            totalCreditHours += creditHours;

            switch (letterGrade) 
            {                 
                case "A":                
                case "a":                     
                totalGradePoints += 4 * creditHours;                     
                break;                 
                
                case "B":                 
                case "b":                     
                totalGradePoints += 3 * creditHours;                     
                break;                 
                case "C":                 
                case "c":                     
                totalGradePoints += 2 * creditHours;                     
                break;                 
                case "D":                
                case "d":                     
                totalGradePoints += 1 * creditHours;                     
                break;             
            }         
        }

        double gpa = totalGradePoints / totalCreditHours;

        System.out.println("The GPA is: "+ gpa);
        input.close();
     }
     }