package bitMagic;

public class FindMissingNumber {
    /*
        The problem is : Given an array of n numbers that has values in range [1...n+1]. Every number appear exactly
        once. Hence, one number is missing. Find the missing number.

        I/P : n = 3, arr[] = [1,3,4]
        O/P : 2
        I/P : n = 4, arr[] = [1,3,5,2]
        O/P : 4
     */

    public void findMissingNumber(int[] arr, int n) {
        int totalXOR = 0;
        int arrXOR = 0;
        for (int i = 0; i < n; i++) {
            arrXOR = arrXOR ^ arr[i];
            totalXOR = totalXOR ^ (i+1);
        }
        totalXOR ^= (n+1);
        int res = totalXOR ^ arrXOR;
        System.out.println(res);
    }

}
