package recursion;

public class printNTo1 {

    void print(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        print(n-1);
    }

}
