import java.util.*;
public class Array4 {
    public static void main(String[] args) {
        System.out.print("Enter the size of array : ");
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int numbers[] = new int[size];

            //input 
            for(int i=0; i<size; i++){
                numbers[i] = sc.nextInt();
            }

            System.out.println("Output is");

            //output 
            for(int i=0; i<size; i++){
                System.out.println(numbers[i]);
            }
        }
    }
}
