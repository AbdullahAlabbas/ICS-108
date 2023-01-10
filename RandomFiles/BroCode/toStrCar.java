package BroCode;

public class toStrCar 
{
    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year = 2021;   

    public String toString()
    {
        String myString = make +"\n"+color+"\n"+model+"\n"+year;
        return myString;
    }
}
