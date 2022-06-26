package mathematics;

public class PrintDivisors {

    /*
        Naive Solution : To print all divisors in the range 1 to n.

        TC : O(n)
        ASC : O(1)
     */
    public void method1(int n) {
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }
    }

    /*
        Efficient Solution : As the divisor always appear pair.
            30 : (1, 30), (2, 15), (3, 10), (5, 6)
            -> In these divisors, one is always smaller than or equal to sqrt(n) .
            -> The issue wih this approach is that it does not print in order.

        TC : O(sqrt(n))
        ASC : O(1)
     */
    public void method2(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n/i)
                    System.out.print(n/i + " ");
            }
        }
    }

    /*
        Efficient Solution ( in order ) : We run a loop from 1 to sqrt(n) to print all the divisors, then, a loop from
        sqrt(n) to 1 and print all the quotient achieved from perfect divisors.

        TC : O(sqrt(n))
        ASC : O(1)
     */
    public void method3(int n) {
        int i;
        for (i = 1; i * i < n; i++)
            if (n % i == 0)
                System.out.print(i + " ");
        for ( ; i >= 1 ; i--)
            if (n % i == 0)
                System.out.print(n/i + " ");
    }

}
