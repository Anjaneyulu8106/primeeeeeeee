
public class  prime{
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100 are:");

        for (int num = 2; num < 100; num++) { // Start from 2, as 1 is not prime
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // Numbers less than or equal to 1 are not prime

        for (int i = 2; i <= Math.sqrt(n); i++) { // Check divisors up to sqrt(n)
            if (n % i == 0) {
                return false; // Not prime if divisible
            }
        }

        return true; // Prime if no divisors found
    }
}
