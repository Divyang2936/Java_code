import java.util.Scanner;

public class leb27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of numbers :");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input 
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        // System.out.println("Output is");

        // //output 
        // for(int i=0; i<size; i++){
        //     System.out.println(numbers[i]);
        // }


        // // continue
        // System.out.print("given numbersay is after continue : ");
        // for (int i= 0; i<=size; i++){
        //     if (i==3) continue;
        //     System.out.print( i + " " );
        // }
        // System.out.println();

        // //break
        // System.out.print("given numbersay is after brack  : ");
        // for (int i= 0; i<=size; i++){
        //     System.out.print(i + " ");
        //     if (i==3) break;
        // }
        // System.out.println();

        // //sum
        // int total = 0;
        // for (int j= 0; j<size; j++){
        //     total += numbers[j];
        // }
        // System.out.print("the sum of numbers is :" + total + "\n");
        // System.out.print("the avg of numbers is :"+ total/numbers.length + "\n" );



        //         int max = Integer.MIN_VALUE;
        //         int min = Integer.MAX_VALUE;
        
        //         //chack min, max
        //         for(int i=0; i<numbers.length; i++){
        //             if(numbers[i] < min){
        //                 min = numbers[i];
        //             }
        //             if(numbers[i] > max){
        //                 max = numbers[i];
        //             }
        //         }
        //         System.out.println("Largest number is : " + max);
        //         System.out.println("smolast number is : " + min);

                for (int i=0; i<size-1; i++){
                    for (int j=0; j<size-i-1; j++){
                        if(numbers[j] > numbers[j+1]) {
                            //swap
                            int temp = numbers[j];
                            numbers[j] = numbers[j+1];
                            numbers[j+1] = temp;
                        }
                    }
                }
                for(int i=0; i<size ; i++){
                    System.out.print(numbers[i] + " ");
                }
                System.out.println();

    }
}
