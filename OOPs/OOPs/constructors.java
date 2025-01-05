/**
 * constructors
 */
package OOPs;
public class constructors {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "divyang ";
        p1.age = 19;


        System.out.println(p1.name + p1.age);

        System.out.println(Person.count);
    }
}

class Person {

    String name ;
    int age ;

    //constructors
    static int count ;
    public Person(){
        count ++;
        System.out.println("creaing an objects");
    }
}