public class loop8 {
    public static void main(String[] args) {
        int n = 2006;
        int reverce =0;
        while (n>0) {
            int lastdigt = n%10;
            reverce = (reverce * 10) + lastdigt;
            n/=10;

        }
            System.out.print(reverce);

    }
}
