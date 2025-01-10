// For array arr=[1,2,3,4,5,6]
// Output should be [6,5,4,3,2,1]

import java.util.Scanner;

public class Array5 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int temp[] =new int[size];
        int temVer = size;

        // intput
        System.out.println("Enter the element of arr");
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        //swaping
        for(int i=0; i<size; i++){
            temp[temVer -1] = arr[i];
            temVer = temVer - 1;
        }

        //output
        System.out.println("output");
        for(int i=0; i<size; i++){
            System.out.print( " "+ temp[i]);
        }
    }
}
