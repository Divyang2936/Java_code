import java.util.Scanner;

public class input_output {

    public static void main(String[] args) {
        //command line argument 
        //use the command line argument in terminal java input_output.java "your input"
        // int a = 2;
        // System.out.println("output 1 : " + args[0]);
        // System.out.println("output 2 : " + args[1]);
        //java input_output.java 12,13 14
        //output is 
        //output 1 : 12,13
        //output 2 : 
        

        Scanner sc = new Scanner(System.in);
        System.out.print("your age : ");
        int age = sc.nextInt();

        System.out.print("your full name : ");
        sc.nextLine();
        String full_name = sc.nextLine();

        System.out.print("your first name : ");
        String first_name = sc.next(); 

        System.out.println("your age is : " + age );
        System.out.println("your full name is : "+ full_name);
        System.out.println("your first name is : " + first_name);

        System.out.print("Enter the charecter : ");
        char ch = sc.next().charAt(0);
        System.out.println("charater : "+ ch);

        //output
        // your age is : 19
        // your full name is : divyang patel
        // your first name is : divyang
        //charater : a

        //note : if if uoy take an inout any "string" after any intger value use sc.next();/sc.nextline(); fore brack 

    }
}