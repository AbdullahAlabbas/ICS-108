package Labs.Lab23;


import java.util.LinkedList;

public class Lab23 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 2; i <= 100; i++) {
            numbers.add(i);
        }

        int prime = 2;
        while (prime <= 10) {
            // Remove all multiples of the current prime number
            Integer multiple = prime * 2;
            while (multiple <= 100) {
                numbers.remove(multiple);
                multiple += prime;
            }
            prime = numbers.get(numbers.indexOf(prime) + 1);
        }

        System.out.println("The prime numbers between 2 and 100 are:");
        for (int primeNumber : numbers) {
            System.out.print(primeNumber + " ");
        }
        System.out.println();
    }
}
