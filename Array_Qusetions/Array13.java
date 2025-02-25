//find the lagest number in a given array
import java.util.*;
public class Array13 {
    public static int findLargest (int number[]){
        int largest = Integer.MIN_VALUE;//-infinity
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<number.length; i++){
            if(largest < number[i]){
                largest = number[i];
            }
            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        System.out.println("smalles value is : " + smallest);
        return largest;

    }
    public static void main(String[] args) {
        int number[] = {1, 2, 6, 3, 5};
        // int temp = 0;
        // for(int i=0; i<number.length; i++){
        //     if(temp < number[i]){
        //         temp = number[i];
        //     }
        // }
        // System.out.println("largest value is : " + temp);

        System.out.println("largest value is : " + findLargest(number));


    }
}
