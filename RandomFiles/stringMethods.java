public class stringMethods 
{
    public static void main(String[] args)
    {
        String name = "Bro";

        boolean result = name.equalsIgnoreCase("BRO");
        System.out.println(result);

        int result2 = name.length();
        System.out.println(result2);

        char result3 = name.charAt(1);
        System.out.println(result3);

        int result4 = name.indexOf("B");
        System.out.println(result4);

        boolean result5 = name.isEmpty();
        System.out.println(result5);

        String result6 = name.toUpperCase(); // toLowerCase as well.
        System.out.println(result6);

        String result7 = name.trim(); // white spaces
        System.out.println(result7);

        String result8 = name.replace("o", "a");
        System.out.println(result8);
    }    
}
