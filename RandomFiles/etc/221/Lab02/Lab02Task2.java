import java.util.Scanner;

public class Lab02Task2 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("How many letter Grades?");
        int numberOfLetterGrades = input.nextInt();
        
        for(int i = 0 ; i < numberOfLetterGrades; i++)
            System.out.println(getRandomGrade('A', 'D'));
        
        input.close();
    }
    public static char getRandomGrade(char ch1 , char ch2)
    {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }
}


// import java.util.Scanner;

// public class TaskTwo {
//     public static String randomGrade() {
//         String grade;
//         int randomInt = (int) (Math.random() * 9);
//         switch (randomInt) {
//             case 0:
//                 grade = "A+";
//                 break;
//             case 1:
//                 grade = "A";
//                 break;
//             case 2:
//                 grade = "B+";
//                 break;
//             case 3:
//                 grade = "B";
//                 break;
//             case 4:
//                 grade = "C+";
//                 break;
//             case 5:
//                 grade = "C";
//                 break;
//             case 6:
//                 grade = "D+";
//                 break;
//             case 7:
//                 grade = "D";
//                 break;
//             default:
//                 grade = "F";
//                 break;
//         }
//         return grade;
//     }

//     public static void main(String[] args) throws Exception {
//         Scanner input = new Scanner(System.in);

//         System.out.println("How many letter grades?");
//         int studentNumber = input.nextInt();
//         String grade;

//         for (int i = 0; i < studentNumber; i++) {
//             grade = TaskTwo.randomGrade();
//             System.out.println(grade);
//         }

//         input.close();
//     }
// }