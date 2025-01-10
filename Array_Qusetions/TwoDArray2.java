//Searching for an element x in a matrix.

import java.util.Scanner;

public class TwoDArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the size of cols : ");
        int cols = sc.nextInt();

        int number[][] = new int[rows][cols];

        //input 
        //input rows 
        for(int i=0; i<rows; i++){
            //input colums
            for(int j=0; j<cols; j++){
                number[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enteer the velue of x : ");
        int x = sc.nextInt();

        //out put 
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(number[i][j] == x){
                    System.out.println("x found at location (" + i + "," + j + ")");
                }
            }
        }
    }
}
