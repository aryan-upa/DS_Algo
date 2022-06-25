package mathematics;

public class LCM {

    /*
        This is a naive method.
        TC : O(a*b - max(a,b))
        SC : O(1)
     */
    int method1(int a, int b) { // Naive Solution
        int res = Math.max(a,b);
        while(true) {
            if (res % a == 0 && res % b == 0)
                return res;
            res++;
        }
    }

    int method2gcd(int a, int b) {
        if (b == 0)
            return a;
        return method2gcd(b, a%b);
    }

    /*
        This is an efficient approach using Euclidean Method to find GCD and then using the formula :
            a * b = gcd(a, b) * lcm(a, b)
        Thus,
            lcm(a, b) = (a*b) / gcd(a, b)
     */
    int method2(int a, int b) {
        return (a*b) / method2gcd(a, b);
    }
}
