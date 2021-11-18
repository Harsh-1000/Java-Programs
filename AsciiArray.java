/*  Initialize an integer array with ascii values and print 
the corresponding character values in a single row. */

public class AsciiArray {
    public static void main(String[] args) {
        int[] arr = {73,76, 111, 118, 101, 74,97,118,97};
        for (int a: arr)
            System.out.print((char)a + " ");
    }
}
