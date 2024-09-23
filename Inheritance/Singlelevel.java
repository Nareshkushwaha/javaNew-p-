package Inheritance;

class Animal {
    void eat() {
        System.out.println("Eating...");
    }

    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

public class Singlelevel {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.eat();   
        myDog.sleep(); 
        myDog.bark();  
    }
}

