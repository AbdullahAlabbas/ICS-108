package Labs.Lab11;
public class Undergraduate extends Student{

    String level;

    Undergraduate(String id , String name , String phoneNumber , double gpa , String level){
        super(id,name,phoneNumber,gpa);
        this.level = level;
    }

    @Override
    public String toString() {
        return super.toString() + " Level: " + this.level;
    }
}
