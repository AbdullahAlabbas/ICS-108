package BroCode;
public class Friends 
{
    String name;
    static int numberOfFriends;
    
    Friends(String name)
    {
        this.name = name;
        numberOfFriends++;
    }

    static void displayFriends()
    {
        System.out.println(numberOfFriends);
    }
}
