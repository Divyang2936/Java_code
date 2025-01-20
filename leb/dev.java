class Student {

    int id;
    String name;
    static String clgname = "sou";
    void disply(){
        System.out.println(id +" " + name + " " + clgname);
    }

}

public class dev {
    public static void main(String[] args) {
        String mass = "hello";
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "abc";
        s1.disply();

        Student s2 = new Student();
        s2.id = 102;
        s2.name = "agc";
        s2.disply();

    }

}
