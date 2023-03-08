package Labs.Lab13;
public class City implements Comparable<City>, Cloneable {
    private String cityName;
    private int temperature;


    public String getCityName() {
        return cityName;
    }
    
    
    public int getTemperature() {
        return temperature;
    }

    City(String cityName, int temperature){
        this.cityName = cityName;
        this.temperature = temperature;

    }

    @Override
    public int compareTo(City that) {
        if(this.temperature > that.temperature) return 1;
        else if (this.temperature == that.temperature) return 0;
        else return -1;
    }

    @Override
    public City clone(){
        try{ return (City) super.clone();}
        catch (CloneNotSupportedException ex) {return null;}
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", temperature=" + temperature +
                '}';
    }


    public boolean equals(Object obj){
        if(obj instanceof City) {
            City other = (City) obj;
            return this.cityName == other.cityName && this.temperature == other.temperature;
        };
        return false;
    }}

