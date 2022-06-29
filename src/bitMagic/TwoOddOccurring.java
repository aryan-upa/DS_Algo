package bitMagic;

public class TwoOddOccurring {
    /*
        The problem is to identify two numbers in a given array which occur odd number of times.
        I/P : arr[] = {3,4,4,3,5,4,4,6,7,7}
        O/P : 5 6

        The idea is two use XOR operation, we do XOR of all the numbers in the array this we have XOR of both the odd
        numbers
            XOR = 3 ^ 4 ^ 4 ^ 3 ... ^ 7
            XOR = 5 ^ 6
            XOR = 3

        Now, we find the first bit set in the XOR, this bit defines that there's a difference in this bit in both
        numbers. Now, we separate all the elements in the array in a way that one set contain numbers which have that
        bit set, and another set of numbers which have their bit unset. In one set we will have our one number and in
        other set we will have the other number. Now performing simple XOR operation on both the set will give us the
        required number.
     */

    public int[] twoOddOccurring(int[] arr) {
        int xor = 0, num1 = 0, num2 = 0;
        for (int j : arr)
            xor ^= j;
        int RSB = xor & -xor; // getting the Rightmost Set Bit : -xor = ~(xor - 1)
        for(int i : arr) {
            if ((i & RSB) != 0) // Getting all the numbers which have RSB bit set in them.
                num1 ^= i;
            else
                num2 ^= i;
        }
        return new int[]{num1, num2};
    }
}
