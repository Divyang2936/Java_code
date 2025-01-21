import java.util.Scanner;

public class Methodes2 {

    static void name(){
        System.out.println("My name is Divyang");
    }

    static void BirthadayParty(int paisa){
        System.out.println("budget is : " + paisa);
    }

    static String FrindName(){
        return "het";
    }

    static String GfName(int money){
        return "Gf to hai hi nahi ";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        name();
        BirthadayParty(2000);
        System.out.println(FrindName());
        System.out.print("paisa don name lo : ");
        int paisa = sc.nextInt();
        System.out.println(GfName(paisa));
    }
}
