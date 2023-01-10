package RandomFiles.BroCode;


public class twoDarrayz 
{
    public static void main(String[] args)
    {
        String[][] cars = new String[3][3]; // or cars = {{"1","2",3},{"4","5","6"}};

        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";

        cars[1][0] = "Mustang";
        cars[1][1] = "Ranger";
        cars[1][2] = "F-15";

        cars[2][0] = "Ferrari";
        cars[2][1] = "Lambo";
        cars[2][2] = "Tesla";


        for(int i =0; i < cars.length; i++)
        {
            System.out.println();
            for(int j = 0; j < cars[i].length; j++)
            {
                System.out.print(cars[i][j] + " ");
            } 
        }
    }    
}
