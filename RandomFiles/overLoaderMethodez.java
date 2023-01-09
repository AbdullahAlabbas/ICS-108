public class overLoaderMethodez
{
    public static void main(String[] args)
    {
        int x = add(1,2);
        System.out.println(x);
    }   
    
    static int add(int a, int b)
    {
        System.out.println(("1"));
        return a + b;
    }

    static int add(int a , int b , int c)
    {
        System.out.println("2");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d)
    {
        System.out.println("3");
        return a + b + c + d;
    }
}
