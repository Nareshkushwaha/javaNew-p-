


class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }

    void sound(String loudness) {
        System.out.println("Animal makes a " + loudness + " sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    void sound(String loudness, String frequency) {
        System.out.println("Dog barks " + loudness + " and " + frequency);
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound(); 
        animal.sound("loud"); 

        Dog dog = new Dog();
        dog.sound(); 
        dog.sound("loud", "high"); 

        Animal animalDog = new Dog();
        animalDog.sound(); 
        animalDog.sound("loud"); 
    }
}


