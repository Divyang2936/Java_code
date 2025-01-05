// clear bit 
// clear the 3rd bit (position = 2) of a number n. (n = 0101)
// Bit Mask : 1<<i
// Operation : AND with NOT
public class BitManipulation3 {
    public static void main(String[] args) {
        int n = 5;
        int position = 2;
        int bitMask = 1<<position;
        int notbitMask = ~(bitMask);

        int newNumber = notbitMask & n;
        System.out.println(newNumber);
    }
}
