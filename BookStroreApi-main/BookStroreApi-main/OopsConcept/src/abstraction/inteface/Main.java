package abstraction;
// Abstract class
abstract class Animal {
    // Abstract method
    public abstract void sound();

    // Concrete method
    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Subclass providing implementation for the abstract method
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Another subclass providing its own implementation
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        // You cannot create an instance of an abstract class
        // Animal animal = new Animal(); // This would cause an error

        // Create instances of concrete subclasses
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Call the abstract method (polymorphism)
        dog.sound(); // Outputs: Dog barks
        cat.sound(); // Outputs: Cat meows

        // Call the concrete method
        dog.sleep(); // Outputs: Animal is sleeping
        cat.sleep(); // Outputs: Animal is sleeping
    }
}
