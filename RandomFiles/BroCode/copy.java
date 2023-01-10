package RandomFiles.BroCode;

public class copy 
{
    public static void main(String[] args)
    {
        Car39 car1 = new Car39("Chevrolet","Camoro",2021);
        Car39 car2 = new Car39("Ford", "Mustang", 2022);

        car2.copy(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    }    
}
