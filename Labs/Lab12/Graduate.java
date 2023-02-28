package Labs.Lab12;
public class Graduate extends Student{

    public Graduate(int id, double gpa){
        super(id,gpa);
    }

    @Override
    public String getStatus(){

        if (getGpa() >= 3.0)   return "good";
        else  return "probation";
    }}
