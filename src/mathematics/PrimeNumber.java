package mathematics;

public class PrimeNumber {

    /*
        Naive Solution : Checking the divisibility of n by all numbers from 2 to n-1.
        TC : O(n)
        ASC : O(1)
     */
    public boolean method1(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    /*
        Efficient Solution : Checking for numbers only till the square root of n.
        As multiples always come in pairs, if no divisor exist before sqrt(n) then it has no pair in the remaining
        numbers till n-1.
        TC : O(sqrt(n))
        ASC : O(1)
     */
    public boolean method2(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i * i <= n ; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    /*
        More Efficient Solution : Checking for all the numbers upto sqrt(n) but only checking by numbers which are not
        divisible by 2 or 3. This can be achieved by skipping the values by 6 after starting from 5 and checking all the
         other possibilities beforehand.
        This approach is best for very large values of n.

        TC : O(sqrt(n)/6) -> O(sqrt(n))
        ASC : O(1)
     */
    public boolean method3(int n) {
        if (n == 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i < n; i+=6)
            if ( n % i == 0 || n % (i + 2) == 0)
                return false;
        return true;
    }
}
