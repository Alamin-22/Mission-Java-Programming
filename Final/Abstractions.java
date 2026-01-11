package Final;

abstract class Animal {

    // this is abstract because it has no body logic and we use abstract keyword
    // here
    abstract void sound();

    void sleep() {
        System.out.println("Animal is sleeping ");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog Barking,,, Gheu Gheu");
    }
}

public class Abstractions {

    public static void main(String[] args) {

        Animal dog1 = new Dog();
        dog1.sound();
        dog1.sleep();

    }

}
