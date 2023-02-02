package Labs.Lab05;

public class Main {

    public static void main(String[] args) 
    {
        Point firstOne = new Point();
        Point secondPoint = new Point(10,30.5);

        double value = firstOne.distance(secondPoint);

        System.out.printf("%s %.2f", "The distance is :" , value);
        
        
    }
}