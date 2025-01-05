import java.util.Scanner;
public class binaryConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int pow = 1;
        while (n > 0){
            int remender = n % 2;
            n = n / 2;
            ans += (remender * pow);
            pow = pow * 10;
        }
        System.out.print(ans);
    }
}
