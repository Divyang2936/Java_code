import java.util.Scanner;

public class s1 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        System.out.print("your age : ");
        int age = sc.nextInt();

        System.out.print("your full name : ");
        // sc.nextLine();
        String full_name = sc.nextLine();
        
        System.out.println(age);
        System.out.println(full_name);
    }
}
