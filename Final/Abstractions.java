package Final;

abstract class Animal {

    abstract void sound();

    void sleep() {
        System.out.println("\n Animal is sleeping");
    }

}

class Dog extends Animal {
    void sound() {
        System.out.println("Dogs make Wolf Wolf sound, Barking");
    }
}

class Abstractions {

    public static void main(String[] args) {

        Animal d1 = new Dog();

        d1.sound();
        d1.sound();

    }

}