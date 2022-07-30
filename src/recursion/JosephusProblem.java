package recursion;

public class JosephusProblem {

    int survivor(int n, int k) {
        if (n == 1)
            return 0;
        return (survivor(n-1, k) + k) % n;
    }

}
