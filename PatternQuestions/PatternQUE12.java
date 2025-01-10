/*Q: Print a palindromic number pyramid
    1
   212
  32123
 4321234
543212345
 */
public class PatternQUE12 {
    public static void main(String[] args) {
        int n = 5;

        //outer loop
        for(int i=1; i<=n; i++){

            //inner loop
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
