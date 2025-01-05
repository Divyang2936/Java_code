import java.lang.reflect.Method;

public class metods {

    static void voidmethods(){
        System.out.println("void method is calling ");
    }

    static void voidmethodNTR(int kiraya){
        System.out.println("void method is calling with parameter ");
    }

    static String voidmethodstring(){
        return "divyang";
    }

    static String voidmethString2(int money){
        return "piasaa....";
    }

    static int addition (int a, int b){
            return a+b;
    }

    public static void main(String[] args) {
        System.out.println("hello world");
        //method calling 
        voidmethods();
        voidmethodNTR(5);

        String str1 = voidmethodstring();
        String str2 = voidmethString2(20);

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(addition(5, 3));
    }
}