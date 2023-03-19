package Labs.Lab15;
public class TimeFormatException extends Exception{
    public TimeFormatException() {
        super("Try Again:");
    }
    public TimeFormatException(String msg) {
        super(msg);
    }
}
