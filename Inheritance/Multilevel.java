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
class Pug extends Dog{
    void size(){
        System.err.println("My size is small");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Pug pug = new Pug();

        pug.eat();   
        pug.walk();  
        pug.bark();  

    }
}


