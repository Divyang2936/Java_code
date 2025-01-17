

public class basics {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 14;
        p1.name = "divyang";

        Person p2 = new Person();
        p2.age = 20;
        p2.name = "het";

        System.out.println(p1.age + " " + p1.name);
        System.out.println(p2.age + " " + p2.name);

        p1.eat();
        p1.walk();

        p2.eat();
        p2.walk();
        p2.walk(2);

        System.out.println(Person.count);
    }
}

class Person {
    String name;
    int age;

    static int count;

    public Person() {
        count ++;
        System.out.println("creaing an objects ");
    }

    

    void walk(){
        System.out.println(name + " is walking .");
    }

    void eat() {
        System.out.println(name + " is eating .");
    }

    void walk(int steps){
        System.err.println(name + " walked " + steps + "steps");
    }
}