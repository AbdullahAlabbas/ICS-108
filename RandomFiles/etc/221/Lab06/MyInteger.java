public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getInteger() {
        return value;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static boolean isOdd(int n) {
        return n % 2 == 1;
    }

    public static boolean isPrime(int n) {
        boolean prime;
        if (n > 1)
            prime = true;
        else
            prime = false;

        for (int i = 2; prime && i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0)
                prime = false;
        }
        return prime;
    }

    public boolean equals(MyInteger integer) {
        return value == integer.value;
    }
}