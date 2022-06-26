package mathematics;

public class ComputingPower {
    // The problem is to compute power of a number, such that given p and q compute p raised to the power q.

    /*
        Naive Method
        Iterative approach to find power.

        TC : O(n)
        ASC : O(1)
     */
    public int method1(int p, int q) {
        int res = 1;
        for (int i = 0; i < q; i++) {
            res = res * p;
        }
        return res;
    }

    /*
        Efficient Method
            This is a recursive method in finding out power of p.

            pow(p, q) = IF (q is even)
                            pow(p, q/2) * pow(p, q/2)
                        ELSE
                            pow(p, q-1) * p

        TC : O(log n)
        ASC : O(log n)
     */
    public int method2(int p, int q) {
        if (q == 0)
            return 1;
        int temp = method2(p, q/2);
        temp *= temp;
        if (q % 2 == 0)
            return temp;
        else
            return temp * q;
    }

    /*
        More Efficient Approach
            This approach utilizes the bits in the power to do the operation.

            for 3 to the power 10 can be written as : 3^8 * 3^2.
                10 -> 1 0 1 0
                      8 4 2 1
                   3^8  *  2  = 3^8 * 3^2.
       TC : O(log n)
       ASC : O(1)
     */
    public int method3(int p, int q) {
        int res = 1;
        while(q > 0) {
            if((q&1) == 1)
                res*=p;
            p*=p;
            q>>=1;
        }
        return res;
    }
}
