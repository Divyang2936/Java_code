// update bit 
// Uodate the 2nd bit (position = 1) of a number n to 1. (0101)
// for 0                     for 1
// Bit mask:1<<i             Bit mask:1<<i 
// Operation:AND with NOT    Operation : OR

import java.util.Scanner;

public class BitManipulation4 {
    public static void main(String[] args) {

        System.out.print("Enter the Opration : ");
        Scanner sc = new Scanner(System.in);
        int Operation = sc.nextInt();
        int n = 5;
        int position = 1;
        int bitMask = 1<<position;

        if (Operation == 1){// set bit 
            int newNumber2 = bitMask | n;//for 1
            System.out.println(newNumber2);
        } else {//clear bit 
            int notbitMask = ~(bitMask);
            int newNumber = notbitMask & n;
            System.out.println(newNumber);
        }
    }
}
