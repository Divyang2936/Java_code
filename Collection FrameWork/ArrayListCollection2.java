//use of ".size()" Function

import java.util.ArrayList;

public class ArrayListCollection2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //add some value 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //get the size of list 
        System.out.println("size of list : " + list.size());

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

    }
}
