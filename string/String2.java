import java.text.SimpleDateFormat;
import java.util.Date;

public class String2 {
    public static void main(String[] args) {
        String s1 = "DIVYANG";
        String s2 = "divyang";
        String s3 = "  Dev ";
        String s4 = "Divyang@patel";
        int a1 = 2;

        System.out.println("length of s1 : " + s1.length() + "\nlength of s2 : " + s2.length() + "\nlength of s3 : " + s3.length());
        System.out.println("Convert in lower case to upper case : " + s1 + " = " + s1.toLowerCase());
        System.out.println("convert in upper case to lower case : " + s2 + " = " + s2.toUpperCase());
        System.out.println("is s1 = s2 : "+ s1.equals(s2));
        System.out.println( "egnore case sensitive , is s1 = s2 : "+ s1.equalsIgnoreCase(s2));
        System.out.println("removed space from s3 : " + s3.trim());
        System.out.println("replase D to d in s3 : " + s3.replace('D','d'));

        System.out.println("sub String of s4 is : " + s4.substring(8));
        System.out.print("Devide s4 in 2 part : ");

        String [] arr = s4.split("@");
        for (String a : arr){
            System.out.println(a);
        }
        System.out.println("is pstel in S4 : " + s4.contains("patel"));
        
        System.out.println("convert int to String : " + String.valueOf(a1));

        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        String str = ft.format(new Date());
        System.out.println("formatted date : " + str);
		//output : formatted date : 16-12-2024

    }
}
