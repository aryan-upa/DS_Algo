package mathematics;

public class PalindromeNumber {

    /*
        TC = O(n)
        SC = O(1)
        n : no. of digits.
     */
    boolean isPalindrome(long n) {
        long res = 0;
        long temp = n;
        while(temp != 0) {
            long lD = temp % 10;
            res = res*10 + lD;
            temp /= 10;
        }
        return res == n;
    }

}
