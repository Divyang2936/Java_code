import java.io.FileReader;
import java.util.ArrayList;

public class Exception1 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        


        FileReader f2;
        try{
        f2 = new FileReader("call.txt");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            // f2.close();
            System.out.println("hi i am from finally");
        }
        //output 
        //call.txt (The system cannot find the file specified)
        


        // //this is an error 
        // ArrayList<Integer> al = new ArrayList<>();
        // while (true) {
        //     al.add(1);
        // }
        // //java.lang.OutOfMemoryError

    }
}