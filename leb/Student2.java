public class Student2 {
    
    String name ;
    int rollNo;

    Student2(String s, int n){
        name = s;
        rollNo = n;
    }

    Student2(Student2 s1){
        name = s1.name;
        rollNo = s1.rollNo;
    }

    void print (){
        System.out.println(name + " " +rollNo);
    }
    public static void main(String[] args) {
        Student2 s1= new Student2("dev" , 2);
        s1.print();
        Student2 s2 = new Student2(s1);
        s1.print();

    }
}
