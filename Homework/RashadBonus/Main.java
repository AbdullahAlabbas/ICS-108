package Homework.RashadBonus;
public class Main {
    public static void main(String[] args) {
        int[] a = {1, 4 , 3 , 2};
        int[] b = {2, 4 , 6 ,3 ,1};

        int result = 0;

        for (int i : b) {
            result ^= i;
            for (int j : a) 
                result ^= j;
        }

        System.out.println(result);
    }
}