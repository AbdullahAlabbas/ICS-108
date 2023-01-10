package RandomFiles.BroCode;


public class encapsul 
{
    public static void main(String[] args)
    {
        Car39 car = new Car39("Chevrolet", "Comaro", 2021);

        car.setMake("Tesla");

        System.out.println(car.getModel());
        System.out.println(car.getMake());
        System.out.println(car.getYear());


    }   
}
