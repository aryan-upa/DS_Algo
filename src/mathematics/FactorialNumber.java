package mathematics;

public class FactorialNumber {

    public int method1(int n) { // Iterative Approach
        int res = 1;
        while (n > 0) {
            res*=n--;
        }
        return res;
    }

    public int method2(int n) { // Recursive Approach
        if (n == 0)
            return 1;
        return n * method2(n-1);
    }

}
