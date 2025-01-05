package OOPs;

//class does not occupy any space in the memory
class Animal{
    int legs;
    void eat(){
        System.out.println("Eating...");
    }
}

public class oops1 {
    public static void main(String[] args) {
        Animal cat = new Animal();//object creation , object take's space in the memory
        cat.legs = 4;
        cat.eat();
    }
}
