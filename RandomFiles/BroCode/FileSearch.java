package BroCode;
import java.io.File;

public class FileSearch 
{
    public static void main(String[] args)
    {
        File file = new File("secret_message.txt");
        if(file.exists())
        {
            System.out.println("That file exists :o!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            // file.delete("Name of the File");
        }

        else
        {
            System.out.println("That file does not exist :(");
        }
    }    
}
