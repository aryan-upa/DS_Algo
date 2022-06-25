package mathematics;

public class GCD {

    public int method1(int p, int q) { // Naive Solution
        int GCD = Math.min(p,q);
        for (int i = GCD; i >= 1; i--)
            if(p % i == 0 && q % i==0)
                return i;
        return 1;
    }

    /*
        Euclidean Algorithm :
            According to GCD algorithm...
            GCD of m and n :
                Let 'b' be smaller than 'a' .
                gcd(a, b) = gcd (a - b, b)

     */
    public int method2(int a, int b) {
        while(a != b) {
            if (a > b)
                a-=b;
            else
                b-=a;
        }
        return a;
    }

    public int method3(int a, int b) { // Euclidean Approach, but recursive.
        if (b == 0)
            return a;
        return method3(b, a % b);
    }
}
