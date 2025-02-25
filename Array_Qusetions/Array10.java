//passing arrays as Argument 

public class Array10 {
    public static void update(int marks[]) {
        //update marks using for loop 
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {97, 98, 99};
        update(marks);//calling update method 

        //print the updated marks 
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
    }
}
