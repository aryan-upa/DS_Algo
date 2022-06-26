package mathematics;

public class PrimeFactors {

    /*
        Naive Solution : Iterate from 2 to n-1. If iterator is prime then check run a while loop while dividing the
        number with i, if 'i' completely divides the number.

        TC : O(n2 log n)
        ASC : O(1)
     */
    public void method1(int n) {
        PrimeNumber obj = new PrimeNumber();
        for (int i = 2; i < n; i++) {
            if(obj.method3(i)) {
                int x = i;
                while(n % x == 0) {
                    System.out.print(i + " ");
                    x*=i;
                }
            }
        }
    }

    /*
        Efficient Solution : A number can be written can multiples of powers of prime. And all the prime divisors of
        that number can be found upto the square root of n.

        TC : O(sqrt(n))
        ASC : O(1)
     */
    public void method2(int n) {
        if (n <= 1)
            return;
        for (int i = 2; i * i < n; i++) {
            while(n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if(n > 1)
            System.out.println(n);
    }

    /*
        More Efficient Solution : A number can be written can multiples of powers of prime. But, we can reduce the
        number of checks by almost 3 times if we extract-out all the powers of 2 and 3. Then we can start a loop with 5
        check whether the number is divisible by 'i' or 'i+2' and then increment i by 6.

        TC : O(sqrt(n))
        ASC : O(1)
     */
    public void method3(int n) {
        if (n <= 1)
            return;
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }
        while (n % 3 == 0) {
            System.out.print(3 + " ");
            n /= 3;
        }
        for (int i = 5; i*i <= n ; i+=6) {
            while(n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
            while (n % (i+2) == 0) {
                System.out.print((i+1) + " ");
                n /= (i+1);
            }
        }
        if(n > 3)
            System.out.println(n);
    }

}
