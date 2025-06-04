import java.util.*;

public class ArrayListCollection6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        //befor sorting 
        System.out.println(list);
        
        //after sorting 
        Collections.sort(list);//Ascending order 
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());//descending order 
        System.out.println(list);

    }
}
