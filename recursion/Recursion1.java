// Recursion1
//Print Number from 5 to 1
public class Recursion1 {

    public static void printNumber(int n){
        if(n==0){
            return ;
        }
        System.out.print(n);
        printNumber(n - 1);
    }
    public static void main(String[] args) {

        // Recursion
        int n = 5;
        printNumber(n);
    }
}