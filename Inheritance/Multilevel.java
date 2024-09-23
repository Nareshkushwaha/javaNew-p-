package Inheritance;

class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

// Parent class inheriting from Animal
class Mammal extends Animal {
    void walk() {
        System.out.println("Walking...");
    }
}

// Child class inheriting from Mammal
class Dog extends Mammal {
    void bark() {
        System.out.println("Barking...");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.eat();   
        myDog.walk();  
        myDog.bark();  
    }
}
