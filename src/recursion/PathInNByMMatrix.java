package recursion;

public class PathInNByMMatrix {

    int count(int n, int m) {
        if (n == 1 || m == 1)
            return 1;
        return count(n-1, m) + count(n, m-1);
    }

}
