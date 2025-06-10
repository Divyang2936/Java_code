import java.util.Scanner;

public class loop11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n==2) {
            System.out.println("number is prime");
            
        }else {
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i== 0){
                    System.out.println("number is not prime");
                    break;
                }
                System.out.println("number is prime ");
            }
        }
    }
}
