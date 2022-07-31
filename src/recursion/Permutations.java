package recursion;

public class Permutations {

    String swap(String str, int i, int j) {
        char[] chars = str.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return new String(chars);
    }

    void printPermutations(String str, int i) {
        if ( i == str.length() - 1) {
            System.out.println(str);
            return;
        }
        for (int j = i; j < str.length(); j++) {
            str = swap(str, i, j);
            printPermutations(str, i+1);
            str = swap(str, i, j);
        }
    }

}
