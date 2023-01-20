package PracticeProblems;
public class DegreeTable 
{
    public static void main(String[] args)
    {
        int celsius;
        double fahrenheit;

        System.out.printf("%5s %5s", "celsius" , "fahrenheit");

        for(celsius = 0 ; celsius <= 100; celsius++)
        {
            fahrenheit = (celsius * 9/5.0) + 32;
            System.out.printf("%d %9.1f \n", celsius , fahrenheit);
        }
    }
}
