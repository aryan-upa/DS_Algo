package recursion;

public class RopeCuttingProblem {

    int maxPieces(int n, int a, int b, int c) {
        if (n == 0)
            return 0;
        if (n < 0)
            return -1;
        int res;
        {
            int part1 = maxPieces(n - a, a, b, c);
            int part2 = maxPieces(n - b, a, b, c);
            int part3 = maxPieces(n - c, a, b, c);
            res = Math.max(part1, Math.max(part2, part3));
        }
        if (res == -1)
            return -1;
        return res + 1;
    }

}
