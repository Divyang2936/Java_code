        /*Q:Print the pattern 
*        *
**      **
* *    * *
*  *  *  *
*   **   *
*   **   *
*   **   *
*   **   *
*  *  *  *
* *    * *
**      **
*        * */
public class PatternQUE19 {
    public static void main(String[] args) {
        int n = 5; // Adjust the value of 'n' to change the size of the butterfly
        for (int i=0; i<=n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                if (j == 0 || j == i || j == 2 * n - i - 1 || j == 2 * n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = n; i>=0; i--) {
            for (int j = 0; j < 2 * n; j++) {
                if (j == 0 || j == i || j == 2 * n - i - 1 || j == 2 * n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
