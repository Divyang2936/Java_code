import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        int marks[] = new int[100];

        //take an input from user 
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();//take input at 0th index 
        marks[1] = sc.nextInt();//take input at 1st index 
        marks[2] = sc.nextInt();//take input at 2nd index 

        //printing an array 
        System.out.println("phy = " + marks[0]);//pring the marks of phy
        System.out.println("che = " + marks[1]);//pring the marks of che
        System.out.println("maths = " + marks[2]);//pring the marks of maths

        //update marks 
        marks[0] = 95;
        marks[1] = marks[1] + 1;

        System.out.println("updated mamrks is :- ");
        System.out.println("phy = " + marks[0]);//pring the marks of che
        System.out.println("che = " + marks[1]);//pring the marks of maths

        //calculate the percentage 
        int percentage = (marks[0] + marks[1] +  marks[2])/ 3;
        System.out.println("percentage : " + percentage + "%");
    }
}
