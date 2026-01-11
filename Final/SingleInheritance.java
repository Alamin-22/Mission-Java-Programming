package Final;

// this is parent class
class Animal {

    void eat() {
        System.out.println("\n setting....");
    }
}

// child class
class Dog extends Animal {
    void bark() {
        System.out.println("\n Barking ....");
    }
};

// class Dog extends Animal {
// void bark() {
// System.out.println("\n Barking ....");
// }
// };

public class SingleInheritance {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.eat();
        d1.bark();

    };

}