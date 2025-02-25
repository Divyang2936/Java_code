import java.util.Scanner;

public class Practical3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of subject 1 : ");
        int sub1 = sc.nextInt();
        System.out.print("Enter the marks of subject 2 : ");
        int sub2 = sc.nextInt();
        System.out.print("Enter the marks of subject 3 : ");
        int sub3 = sc.nextInt();
        System.out.print("Enter the marks of subject 4 : ");
        int sub4 = sc.nextInt();
        System.out.print("Enter the marks of subject 5 : ");
        int sub5 = sc.nextInt();
        System.out.print("Enter the marks of subject 6 : ");
        int sub6 = sc.nextInt();

        int total = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;
        System.out.print("Total marks of all subje is : " + total);
        System.out.print("Percentage is "+(total*100)/600 + "%");

        //using array 
        System.out.print("Enter total no of subject: ");
        int totalSubject = sc.nextInt();
        int[] marks = new int[totalSubject];
        int Totalmarks = 0;
        for (int i=0; i<totalSubject; i++){
            System.out.print("Enter the marks of subject " + (i+1) + ":");
            marks[i] = sc.nextInt();
            Totalmarks = Totalmarks + marks[i];
        }

        System.out.println("total marks is " + Totalmarks);

        System.out.print("Percentage is "+(Totalmarks*100)/(totalSubject*100) + "%");
        sc.close();

    }
}
