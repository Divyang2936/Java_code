import java.util.Scanner;

public class Array7 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array :");
        int size = sc.nextInt();
        int[] number = new int[size];
        System.out.println("Enter the element of array");
        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }
        int evencount = 0 , oddcount = 0;



        for(int i=0; i<number.length; i++){
            if(number[i]%2 == 0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }

        System.out.println("even number : " + evencount);
        System.out.println("odd number : " + oddcount);
    }
}
