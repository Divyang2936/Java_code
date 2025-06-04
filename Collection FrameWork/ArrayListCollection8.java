import java.util.ArrayList;

public class ArrayListCollection8 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mArrayList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1; i<=5; i++){
            list1.add(i);
            list2.add(i*2);
            list3.add(i*3);
        }
        mArrayList.add(list1);
        mArrayList.add(list2);
        mArrayList.add(list3);

        System.out.println(mArrayList);
        for(int i=0; i<mArrayList.size(); i++){
            ArrayList<Integer> current = mArrayList.get(i);
            for(int j=0; j<current.size(); j++){
                System.out.print(current.get(j) + " ");
            }
            System.out.println();
        }

        
    }
}
