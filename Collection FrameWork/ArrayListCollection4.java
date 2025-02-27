//find the maximum in ArrayList

import java.util.ArrayList;

public class ArrayListCollection4 {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        for(int i=0; i<list.size(); i++){
            // if(min>list.get(i)){
            //     min = list.get(i);
            // }
            // if(max<list.get(i)){
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
            min = Math.min(min, list.get(i));
        }
        System.out.println("maximum value is : " + max);
        System.out.println("Minimum value is : " + min);
    }
}
