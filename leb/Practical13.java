class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("This mammal walks on land.");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}


public class Practical13 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        
        // Calling methods from all three classes
        dog.eat();   // From Animal class
        dog.walk();  // From Mammal class
        dog.bark();  // From Dog class
    
    }
}
