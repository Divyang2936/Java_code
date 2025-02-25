import java.util.Scanner;

public class _13 {
    public static void main(String[] args) {
        // str1ing str = "str1ing";
        // for(int i=0; i<=str1.length(); i++){
        //     System.out.println(str1.substr1ing(0,i));
        // }

        //////////////////////////////////////////////////////////
/// 

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string : ");
        String str1 = sc.next();
        String rev = "";
        for(int i=str1.length()-1; i>=0; i--){
            rev = rev + str1.charAt(i);
        }
        if (str1.equalsIgnoreCase(rev)){
            System.out.println("palindrome");
        }else{
            System.out.println("not ");
        }
        sc.close();
    }
}

