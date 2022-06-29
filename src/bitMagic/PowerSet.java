package bitMagic;

public class PowerSet {
    // The problem is to print all the subset of a set, a set containing all subsets is called a Power set.

    public void powerSet(int[] arr) {
        int arrLen = arr.length;
        int totalSubsets = (int) Math.pow(2, arrLen);
        for (int i = 0; i < totalSubsets; i++) {
            System.out.print("-> ");
            for (int j = 0; j < arrLen; j++) {
                if ((i & (1 << j)) != 0)
                    System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new PowerSet().powerSet(new int[]{1,2,3});
    }
}
