import java.util.*;

public class Function1 {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.next();

            printMyName(name);//Function ne call kariyo.
        }
    }
}
