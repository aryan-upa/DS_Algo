package recursion;

import java.util.ArrayList;
import java.util.List;

public class StringSubsets {

    // TC: O(2^n), ASC: O(2^n)
    void subsets(String str, String curr, int pos, List<String> list) {
        if (pos == str.length()) {
            list.add(curr);
            return;
        }
        subsets(str, curr + str.charAt(pos), pos + 1, list);
        subsets(str, curr, pos + 1, list);
    }

}
