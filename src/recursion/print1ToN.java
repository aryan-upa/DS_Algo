package recursion;

public class print1ToN {

    void print(int n) {
        if (n == 0)
            return;
        print(n-1);
        System.out.print(n + " ");
    }

}
