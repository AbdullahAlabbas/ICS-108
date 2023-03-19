package Labs.Lab15;
public class Time {
    int hours , minutes;

    public Time(int hours , int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public Time() {

    }


    public String convertTo12Format(int hours , int minutes) throws TimeFormatException{
        String period = "";
        try{
        if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
            throw new TimeFormatException("Invalid time format!");
        }


        if (hours >= 12) {
            period = "PM";
            hours -= 12;
        } else {
            period = "AM";
        }

        if (hours == 0) {
            hours = 12;
        }}
        catch (TimeFormatException e){
            System.out.println(e.getMessage());
        }

        return hours + ":" + minutes +" " + period;

    }
}