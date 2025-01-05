// Get Bit 
//Get the 3rd bit (positon = 2) of a number n. (n = 0101)
// bit Mark : 1<<i
// Operation : AND
public class BitManipulation1 {

    public static void main(String[] args) {
        int n = 5;//0101
        int positon= 2;
        int bitMask = 1<<positon;

        if ((bitMask & n) == 0){
            System.out.println("Bit was zero ");
        } else { 
            System.out.println("bit was one ");
        }
    }
}