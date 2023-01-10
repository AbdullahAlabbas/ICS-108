package RandomFiles.BroCode;

public class Fish implements Prey,Predator
{

    @Override
    public void hunt() {
        // TODO Auto-generated method stub
        System.out.println("*This fish is hunting smaller fish*");
    }

    @Override
    public void flee() {
        // TODO Auto-generated method stub
        System.out.println("*This fish is fleeing from a larger fish*");
        
    }
    
}
