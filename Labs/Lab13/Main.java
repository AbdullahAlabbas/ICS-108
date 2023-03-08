package Labs.Lab13;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        City[] C1 = new City[4];
        C1[0] = new City("Dhahran", 24);
        C1[1] = new City("Toronto", 16);
        C1[2] = new City("NewCastle", 16);
        C1[3] = new City("Cairo", 27);

        // C1[2] = C1[1].clone();




        for( int i = 0 ; i < C1.length-1 ; i++ ){
            System.out.print( C1[i].getCityName() + " Comparing to " + C1[i+1].getCityName() + " is: ");
            System.out.println(C1[i].compareTo(C1[i+1]));
        }
    }
}



