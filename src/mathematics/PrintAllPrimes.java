package mathematics;

import java.util.Arrays;

public class PrintAllPrimes {
    // The problem is to print all prime numbers in given range.

    /*
        Naive Approach : This approach takes the route of checking all the numbers in the list individually that they
        are prime or not.

        TC : O(n * sqrt(n))
        ASC : O(1)
     */
    public void method1(int n) {
        PrimeNumber primeChecker = new PrimeNumber();
        for (int i = 1; i < n; i++) {
            if (primeChecker.method3(i))
                System.out.print(i + " ");
        }
    }

    /*
        Better Implementation :
        This is the sieve of eratosthenes method.
        This includes creating a boolean type array of n+1 size. Initially we make all the indices to be true indicating
         that all the numbers are prime, then we iterate from 2 and falsify all the indices which are divisible by to we
         go further doing the same for 3 and then 5, skipping four because it is already false so any number which is
        divisible by four is already falsified by 2.

        TC : O(n log n)
        ASC : O(n)
     */
    public void method2(int n) {
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i * i <= n ; i++)
            if (isPrime[i])
                for (int j = 2*i; j < n; j+=i)
                    isPrime[j] = false;

        for(int i = 2; i < n; i++)
            if(isPrime[i])
                System.out.print(i + " ");
    }

    /*
        Optimized Implementation : In this implementation we start the second loop with the i^2 as any multiple of i
        would below i^2 would have had a lower prime factor than i, and it would have been already falsified.

        TC : O(n loglog n)
        ASC : O(n)
     */
    public void method3(int n) {
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);

        for (int i = 2; i * i <= n ; i++)
            if (isPrime[i])
                for (int j = i*i; j < n; j+=i)
                    isPrime[j] = false;

        for(int i = 2; i < n; i++)
            if(isPrime[i])
                System.out.print(i + " ");
    }

    /*
        Further Shorter Implementation : This code is performance wise similar to the previous one, but it has lesser
        lines of code.

        TC : O(n loglog n)
        ASC : O(n)
     */
    public void method4(int n) {
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);

        for (int i = 2; i <= n ; i++)
            if(isPrime[i]) {
                System.out.print(i + " ");
                for (int j = i*i; j <= n ; j+=i) {
                    isPrime[j] = false;
                }
            }

    }
}
