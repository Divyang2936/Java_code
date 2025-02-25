import java.util.Scanner;

public class leb30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        int count = 0;
        boolean Word = true;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == ' ') {
                Word = true;
            } else if (Word && c >= 'A' && c <= 'Z') {
                count++;
                Word = false;
            } else {
                Word = false;
            }
        }

        System.out.println("Number of words starting with capital letters: " + count);
        sc.close();
    }
}
