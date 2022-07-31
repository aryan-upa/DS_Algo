package recursion;

public class SubsetSum {

    // TC: O(2^n), ASC: O(n)
    int subsets(int[] arr, int curr, int pos, int reqSum) {
        if (pos == arr.length) {
            if (curr == reqSum)
                return 1;
            else
                return 0;
        }
        return subsets(arr, curr + arr[pos], pos+1, reqSum) + subsets(arr, curr, pos+1, reqSum);
    }

}
