//Taking a matrix as an input and printing its elements.

import java.util.Scanner;

public class TwoDArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the size of colums : ");
        int cols = sc.nextInt();

        System.out.println(" Enter the element of 2-D array : ");
        int number[][] = new int[rows][cols];

        //intput 
        //rows
        for(int i=0; i<rows; i++){
            //colums
            for(int j=0; j<cols; j++){
                number[i][j] = sc.nextInt();
            }
        }

        System.out.println("Hear is your output : ");

        //output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }
}
