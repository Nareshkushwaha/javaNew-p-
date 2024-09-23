

 package  Inheritance;
 
 class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

// Child class 1 inheriting from Animal
class Mammal extends Animal {
    void walk() {
        System.out.println("Walking...");
    }
}

// Child class 2 inheriting from Animal
class Bird extends Animal {
    void fly() {
        System.out.println("Flying...");
    }
}

// Child class 3 inheriting from Animal
class Fish extends Animal {
    void swim() {
        System.out.println("Swimming...");
    }
}

public class Hieraraical {
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        Bird bird = new Bird();
        Fish fish = new Fish();

        mammal.eat();   // Inherited from Animal
        mammal.walk();

        bird.eat();     // Inherited from Animal
        bird.fly();

        fish.eat();     // Inherited from Animal
        fish.swim();
    }
}

