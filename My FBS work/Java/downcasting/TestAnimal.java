package downcasting;
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class TestAnimal {
    public static void main(String[] args) {
        
        Animal a = new Dog();   // Upcasting
        
        a.sound();              // Allowed
        
        Dog d = (Dog) a;        // Downcasting
        d.bark();               // Now we can access child class function
    }
}
