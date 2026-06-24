
package primenumber;

public class PrimeNumber {
    public static void main(String[] args) {
        int limit = 100; // You can change this value to find more primes
        int[] primes = sieveOfEratosthenes(limit);

        System.out.println("The first " + primes.length + " prime numbers are:");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }

    // Sieve of Eratosthenes algorithm to find all primes less than or equal to n
    public static int[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                count++;
                if (count == 50) break;
            }
        }

        // Extract the first 50 primes
        int[] primeNumbers = new int[50];
        for (int i = 2, j = 0; i <= n && j < 50; i++) {
            if (isPrime[i]) {
                primeNumbers[j++] = i;
            }
        }

        return primeNumbers;

    }
    
}
