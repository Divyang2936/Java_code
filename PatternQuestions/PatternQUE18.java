public class PatternQUE18 {
    public static void main(String[] args) {
        int n = 4;

        //outer loop
        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
