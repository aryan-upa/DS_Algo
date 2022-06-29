package bitMagic;

public class PowerOfTwo {
    // problem is to check whether a number is power of 2 or not.

    /*
        Naive Solution : Keep on dividing the number by 2 until the number becomes zero, if at any point we get an odd
        number remainder when dividing by 2, we return false. Otherwise, true.

        TC : O(log n)
        ASC : O(1)
    */
    public boolean method1(int n) {
        if (n == 0)
            return false;
        while(n != 1) {
            if (n%2 != 0)
                return false;
            n /= 2;
        }
        return true;
    }

    /*
        Efficient Solution : The idea is that, if a number is power of 2 then it will have only 1 bit in the binary
        representation. If we apply & operation of that number with number-1, if a number is power of 2 then it will
        return 0, otherwise a non-zero number.

        TC : O(1)
        ASC : O(1)
    */
    public boolean method2(int n) {
        if (n == 0)
            return false;
        return (n & (n-1)) == 0;
    }

}
