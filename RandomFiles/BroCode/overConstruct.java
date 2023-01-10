public class overConstruct 
{
    public static void main(String[] args) 
    {
        Pizza pizza = new Pizza("Thick" , "tomato", " yellow");
        System.out.println("PIZZA: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.cheese);
        System.out.println(pizza.sauce);
        System.out.println(pizza.topping);

    }    
}
