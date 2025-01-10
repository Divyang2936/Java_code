import java.util.*;

public class Function2 {
    public static int calculetSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Sum of 2 numbers is:"+ calculetSum(a, b));
        }
    }
}
