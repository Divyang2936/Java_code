public class loop7 {
    public static void main(String[] args) {
        int n = 2006;
        while (n>0) {
            int lastdight = n%10;
            System.out.print(lastdight + " ");
            n/=10;
        }
    }
}
