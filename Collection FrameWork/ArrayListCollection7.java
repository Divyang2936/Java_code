//2D arrayList 

import java.util.ArrayList;

public class ArrayListCollection7 {
    public static void main(String[] args) {
        ArrayList <ArrayList<Integer>> mainArrayList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(1); list1.add(2);
        list2.add(3); list2.add(4);

        mainArrayList.add(list1);
        mainArrayList.add(list2);
        
        //printing the main list 
        System.out.println(mainArrayList);

        for (int i=0; i<mainArrayList.size(); i++){
            ArrayList<Integer> corntList = mainArrayList.get(i);
            for(int j=0; j<corntList.size(); j++){
                System.out.print(corntList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
