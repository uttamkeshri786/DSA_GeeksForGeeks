// Count number of bits to be flipped to convert A into B
import java.util.*;
public class Main {
    
    // Function that count set bits
    public static int countSetBits(int n)
    {
        int count = 0;
        while (n != 0) {
            count++;
            n &=(n-1);
        }
        return count;
    }

    // Function that return count of flipped number
    public static int countBitsFlip(int a, int b)
    {
        // Return count of set bits in a XOR b
        return countSetBits(a ^ b);
    }
    
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
        System.out.print(countBitsFlip(a, b));
    }
}
