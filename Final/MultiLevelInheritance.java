package Final;

// 2. Multilevel Inheritance (Grandfather -> Father -> Son)

// this is parent class (grand father)
class Animal {
    void eat() {
        System.out.println("\n Eating....");
    }
}

// child class (father)
class Dog extends Animal {
    void bark() {
        System.out.println("\n Barking ....");
    }
};

// child class (father)
class babyDog extends Dog {

    void weep() {
        System.out.println("\n Weeping ....");
    }
};

public class MultiLevelInheritance {

    public static void main(String[] args) {

        babyDog bbd1 = new babyDog();

        bbd1.weep();
        bbd1.bark();
        bbd1.eat();

    }

}
