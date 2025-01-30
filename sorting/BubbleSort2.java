import java.util.Scanner;

public class BubbleSort2 {
    public static void Printarr1ay(int arr1[]){

        System.out.print("sorted arr : ");
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arr : ");
        int size = sc.nextInt();

        System.out.println("Enter the element of arr :");
        int arr1[] = new int[size];
        for (int i=0; i<size; i++){
            arr1[i] = sc.nextInt();
        }

        //sorting 
        int swap = 0;
        for(int i=0; i<arr1.length-1; i++){

            for(int j=0; j<arr1.length-i-1; j++){
                if(arr1[j] > arr1[j + 1]){
                    //swoping
                    int temp1 = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp1;
                    swap++;
                }
            }
        }
        System.out.println(swap);

        Printarr1ay(arr1);
    }
}
