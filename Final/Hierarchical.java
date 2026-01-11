package Final;

// 2. Multilevel Inheritance  (One Parent -> Many Children)

class Animal {
    void eat() {
        System.out.println("\n Eating....");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("\n Barking ....");
    }
};

class Cat extends Animal {
    void Meow() {
        System.out.println("\n Meow ....");
    }
};

public class Hierarchical {

    public static void main(String[] args) {

        Dog d1 = new Dog();

        d1.eat();
        d1.bark();

        Cat c1 = new Cat();

        c1.eat();
        c1.Meow();

    }

}
