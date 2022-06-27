package bitMagic;

public class KthBit {
    // Problem is to check whether the kth bit is set or not.

    public void method1(int n, int k) { // Using left shift
        if ((n & (1 << (k-1))) != 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public void method2(int n, int k) { // Using right shift
        if(((n >> (k-1)) & 1) == 1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static void main(String[] args) {
        new KthBit().method1(5, 2);
    }
}
