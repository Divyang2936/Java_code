import java.util.*;

public class ArrayListCollection1 {

    public static void main(String[] args) {
        //syntax of ArrayList
        ArrayList<Integer> list1 = new ArrayList<>();//int type using wrapper class name Integer
        ArrayList<String> list2 = new ArrayList<>();//String type using wrapper class name String

        //Add some value in list 1 
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        //Add the element in specific index 
        list1.add(2,3);//perform in lenar time O(n)


        //print the list 
        System.out.println(list1);

        //get the specific indrx element using get Operation 
        int element = list1.get(3);
        System.out.println(element);
        System.out.println(list1.get(4));

        //remove the specific element using the remove function 
        list1.remove(3);
        System.out.println(list1);

        //set the element in specific index using set function 
        list1.set(4, 10);
        System.out.println(list1);

        //check the element is contains in list using contains function if contains return true else false 
        System.out.println(list1.contains(2));
        System.out.println(list1.contains(11));

    }
}