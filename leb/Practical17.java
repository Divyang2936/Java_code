class Parent {
    void show (){
        System.out.println("parent show");
    }
}
class child extends Parent{
    void show (){
        System.out.println("child show");
    }
}
public class Practical17 {
    public static void main(String[] args) {

        child c = new child();
        c.show();
        Parent p = new child();
        p.show();
    }
}
