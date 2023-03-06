package Labs.Lab11;
public class Graduate extends Student{
    String researchArea;
    Graduate(String id , String name , String phoneNumber , double gpa , String researchArea){
        super(id,name,phoneNumber,gpa);
        this.researchArea =researchArea ;
    }


    @Override
    public String toString() {
        return super.toString() + " Research Area: " + this.researchArea;
    }
}
