package bitMagic;

public class OneOddOccurring {
    /*  The problem is to find a number in a given array which is occurring Odd number of times.
        Ex :  I/P : [4,3,4,4,4,5,5]
              O/P : 3
    */

    /*
        Naive Solution : The idea to traverse every element in the array and count its occurrences, if the occurrences
        are odd then print the number and break.

        TC : O(n^2)
        ASC : O(1)
     */
    public int method1(int[] arr) {
        int len = arr.length;
        for (int j : arr) {
            int count = 0;
            for (int k : arr) {
                if (j == k)
                    count++;
            }
            if (count % 2 == 0)
                return j;
        }
        return -1; // If no number is occurring odd times.
    }

    /*
        Efficient Solution : This solution uses the property of XOR Operator.
            a ^ 0 = a
            a ^ a = 0
            a ^ b = b ^ a
            a ^ (b ^ c) = (a ^ b) ^ c
        So, if all numbers in a list appear even number of times, then their XORs will cancel each other and the XOR
        and the amount remaining in the XOR is the required number.

        TC : O(n)
        ASC : O(1)
     */
    public int method2(int[] arr) {
        int len = arr.length;
        int iniXOR = 0;
        for(int i : arr)
            iniXOR = iniXOR ^ i;
        return iniXOR == 0 ? -1 : iniXOR;
    }

}
