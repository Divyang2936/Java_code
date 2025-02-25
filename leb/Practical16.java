import java.util.Scanner;

class findFactorial {
    int factorial(int n){
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            return n*factorial(n - 1);
        }
    }
}

public class Practical16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value: ");
        int n = sc.nextInt();

        findFactorial f = new findFactorial();
        System.out.println("Factorial : "+ f.factorial(n));
        sc.close();
    }
}
