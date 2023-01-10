package BroCode;

public class polyfortanious 
{
    public static void main(String[] args)
    {
        Car41 car = new Car41();
        Bicyle41 bicycle = new Bicyle41();
        Boat boat = new Boat();

        Veicle41[] racers = {car,bicycle,boat};

        for(Veicle41 x : racers)
        {
            x.go();
        }

    }    
}
