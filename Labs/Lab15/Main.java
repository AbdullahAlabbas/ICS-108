package Labs.Lab15;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws TimeFormatException {

        Scanner input = new Scanner(System.in);
        Time time = new Time();
        String cnt = "y";
        int hours , minutes;
        while (cnt.equals("y")){

        try{
            System.out.print("Hours: ");
             hours = input.nextInt();
            System.out.print("Minutes: ");
            minutes = input.nextInt();
        System.out.println(time.convertTo12Format(hours,minutes));}
        catch (TimeFormatException e) {
            throw new RuntimeException(e);
        }

        finally {
            System.out.println("Again? (y/n)");
            cnt = input.next();
        }}

    }
}