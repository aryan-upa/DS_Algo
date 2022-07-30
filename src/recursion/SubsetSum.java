package recursion;

public class SubsetSum {

    int subset(int[] arr, int reqSum, int curr, int pos) {
        if (pos == arr.length)
            return 0;
        if (reqSum == curr)
            return 1;
        return subset(arr, reqSum, curr + arr[pos], pos+1) + subset(arr, reqSum, curr, pos+1);
    }

}
