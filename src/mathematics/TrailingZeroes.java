package mathematics;

public class TrailingZeroes {
    // Program to find trailing zeroes in a factorial.

    /*
        Naive Approach
        The main issue with this approach is the problem of overflow, even for the small numbers the ranges of int will
        overflow very quickly.
        Ex:
            for n = 20, number of digits is 19.
            for n = 100, number of digits is gargantuan.

        Thus, this method is not acceptable.

        TC : O(n)
        ASC : O(1)
     */
    public int method1(int n) {
        int fact = 1;
        while (n > 0) {
            fact*=n--;
        }
        int res = 0;
        while(fact % 10 == 0) {
            res ++;
            fact /= 10;
        }
        return res;
    }

    /*
        This approach counts the number of 5s in the prime factorization of the factorial that will be achieved, because
            every zero is a product of 2 and 5 and a pair of (2 and 5) will create a zero.
        Number of 2s will always be less than the number of 5s in the factorization, so we count the number of 5s.

        To count the number of 5s.
            We calculate how many numbers are at a distance of 5 from each other : floor of n/5.
            Then we add how many numbers are at a distance of 25 from each other : floor of n/25.
                Cuz, these numbers will be having two 5s in their prime factor.
            Similarly, we go for n/125 and so forth... until the divisor become greater than n after which all floors
            would be zero.

        TC : O(log n base 5) -> O(log n)
        ASC : O(1)
     */
    public int method2(int n) {
        int res = 0;
        for (int i = 5; i < n; i*=5) // i : 5, 25, 125, ...
            res = res + n/i;
        return res;
    }

}
