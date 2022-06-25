package mathematics;

public class CountDigits {

    public int method1(long num) { // Iterative Approach
        int numOfDig = 0;
        while(num != 0) {
            num /= 10;
            ++numOfDig;
        }
        return numOfDig;
    }

    public int method2(long num) { // Recursive Approach
        if (num == 0)
            return 0;
        return 1 + method2(num/10);
    }

    public int method3(long num) { // Logarithmic Approach
        return (int) Math.ceil(Math.log(num) + 1);
    }
}
