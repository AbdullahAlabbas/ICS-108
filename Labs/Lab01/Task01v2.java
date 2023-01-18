package Labs.Lab01;

import java.util.Scanner;

public class Task01v2 
{
    public static void main(String[] args) 
    {
        String letterGrade;
        int numOfCourses,credit = 0 , sumOfCredit = 0, i =  0;
        double gpa,sumOfNumericValues = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("How many courses?");
        numOfCourses = input.nextInt();

        System.out.printf("%s %d %s", "Enter letter grade, credit hours for ", numOfCourses , " courses:\n");
        while(i < numOfCourses) // or for(int i = 0; i < numOfCourses; i++)
        {
            letterGrade = input.next();
            credit = input.nextInt();
            sumOfCredit += credit;

            switch(letterGrade)
            {
            case "A+" :sumOfNumericValues += (4.00 * credit);
            break;
            
            case "A" : sumOfNumericValues += (3.75 * credit);
            break;

            case "B+" : sumOfNumericValues += (3.50 * credit);
            break;

            case "B" : sumOfNumericValues += (3.00 * credit);
            break;

            case "C+" : sumOfNumericValues += (2.50 * credit);
            break;

            case "C" : sumOfNumericValues += (2.00 * credit);
            break;

            case "D+": sumOfNumericValues += (1.50 * credit);
            break;

            case "D" : sumOfNumericValues += (1.00 * credit);
            break;

            case "F" : sumOfNumericValues += 0.0;
            break;

            default :
            System.out.println("That is not a letter Grade!");
            break;
            }
            i++;
        }
        
        gpa = sumOfNumericValues / sumOfCredit;
        System.out.println("GPA = " + gpa);
        input.close();

        
    }        
}
