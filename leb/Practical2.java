import java.util.Scanner;

public class Practical2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amoun in rupees :");
        double rupees =sc.nextInt();

        double dollar = rupees / 70 ;
        System.out.print("The amount in doller is : " + dollar );
    }
}
