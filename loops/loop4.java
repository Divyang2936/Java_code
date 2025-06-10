// sum of first n netural number 

import java.util.Scanner;

public class loop4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num :");
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;        
        while (i<=n) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
