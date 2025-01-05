// Set Bit 
// Sett the 2nd bit (position = 1) of a number n. (n = 0101)
// Bit Mask : 1<<i
// Operation : OR

public class BitManipulation2 {
    public static void main(String[] args) {
        int n = 5;
        int position = 1;  
        int bitMask = 1<<position;

        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}
