package recursion;

public class PalindromeRecursion {

    boolean checkPalindrome(String str, int start, int end) {
        if (start >= end)
            return true;
        return (str.charAt(start) == str.charAt(end)) && checkPalindrome(str, start+1, end-1);
    }

}
