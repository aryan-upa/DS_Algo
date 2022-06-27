package bitMagic;

public class CountSetBits {
    // The problem is to find the number of bits that are set in the binary representation of this number.

    /*
        Naive Solution :
        Counting the bits using the right shift operator. Running the while loop until n > 0. Shifting the bit one at a
        time and checking whether the & operation with 1 is 1 or 0. If 1 then increase the count.

        TC : O(n) : n is number of bits in the binary representation.
        ASC : O(1)
    */
    public int method1(int n) {
        int count = 0;
        while(n > 0) {
            n = n >> 1;
            if ((n&1) == 0)
                count++;
        }
        return count;
    }


    // Another approach in writing the naive solution. Still the same functionality and Complexity.
    public int method2(int n) {
        int count = 0;
        while (n > 0) {
            count += (n&1);
            n >>= 1;
        }
        return count;
    }

    /*
        Efficient Solution : Brian Kernighan's Algorithm :
        This is an efficient approach which retrieves the number of set bits within the time complexity of number of
        set bits.

        TC : O(no. of set bits)

        Working : When we subtract 1 from a number, all the bit which were unset after the last set bit gets set, and
        the last set bit gets unset.

        Ex :
            In 1st Iteration :
                40 : 101000
                39 : 100111
                &
                32 : 100000

            In 2nd Iteration :
                32 : 100000
                31 : 011111
                &
                0  : 000000

        Thus, in two iterations we get the result that our number had 2 set bits.
    */
    public int method3(int n) { // Brian Kernighan's Algo
        int res = 0;
        while(n > 0) {
            n = ( n & (n-1));
            res++;
        }
        return res;
    }

	/*
		Most Efficient Approach :

		This is the lookup table approach. In this approach we pre-calculate all the bits that are required to represent
		 numbers from 0 to 255, which can be represented in 8 bits.

		We then check what number is represented by last 8 bits of the number and add the bits required to represent
		them in our result, then we right shift the number by 8 bits and repeat the process until all bytes are over.

		TC  : O(1)
		ASC : O(1)
	*/

    int[] table = new int[256];

    void initialize() {
        table[0] = 0;
        for (int i=1; i<256; i++)
            table[i] = (i&1) + table[i/2];
    }

    int count(int n) {
        int res;
        res = table[n & 0xff];
        n >>= 8;
        res += table[n & 0xff];
        n >>= 8;
        res += table[n & 0xff];
        n >>= 8;
        res += table[n & 0xff];
        return res;
    }

}
