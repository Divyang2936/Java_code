import java.util.Scanner;

public class condition2 {
    public static void main(String[] args) {

        System.out.println("select your choice ");
        Scanner sc = new Scanner (System.in);
        int choice = sc.nextInt();
        // can not switch on a valu of type boolean . 
        //only convertible int values, string or enum variables are permitted .
        // after avery case you need to break to stop break otherwise case are continuous running  
        switch (choice){
            case 1 : System.out.println("chai");
            break ;
            case 2 : System.out.println("cold coffee");
            break;
            case 3 : System.out.println("hot coffee");
            break;
        }
    }
}
