import java.text.SimpleDateFormat;
import java.util.Date;

public class h {

    public static void main(String[] args) {
        System.out.println(new Date());
        //output Mon Dec 16 18:39:59 IST 2024
        //formatted date
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        String str = ft.format(new Date());
        System.out.println("formatted date : " + str);
		//output : formatted date : 16-12-2024
    }
}