import java.util.Scanner;

public class SelectionSort2 {

    //selection sort 
    public static void selectionsort(int arr[]){
        // int swap = 0;
        for(int i=0; i<arr.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest] > arr[j]){//if i do < i got array in dic
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
            // swap++;
        }
        // System.out.println(swap);
    }

    public static void Printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arr : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        //take an inpute 
        System.out.print("Enter the element of array :");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        selectionsort(arr);

        System.out.print("sorted array is :");
        Printarr(arr);
    }
}
