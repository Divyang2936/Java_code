import java.util.Scanner;

public class test {
    public static void caller(int String){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        int x=sc.nextInt();
    }
    public static void main(String[] args) {

        System.out.println("================================");
        for(int i=0;i<3;i++){
            caller(i);

            //Complete this line
        }
        for(int i=0;i<3;i++){
            System.out.printf("%-15s%03d\n",);
        }
        System.out.println("================================");
    
    }
}
