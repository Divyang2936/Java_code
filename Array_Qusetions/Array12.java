//practice Question of linear search 

import java.util.Scanner;

public class Array12 {

    public static int findItem(String menu[], String item){
        for(int i=0; i<menu.length;i++){
            if(menu[i].equals(item)){
                return i + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu[] = {"chole bhature", "dosa","vada", "samosa"};
        System.out.print("Enter your choice : ");
        String item = sc.nextLine();

        int index = findItem(menu, item);

        if(index == -1){
            System.out.println("Item is not found");
        }else{
            System.out.println("Item is at no : " + index);
        }
        sc.close();
    }
}
