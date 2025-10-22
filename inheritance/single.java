import java.util.*;

class Animal {
    void eat() {
        System.out.println("eating");
    };
};

class Dog extends Animal {

    void sound() {
        System.out.println("barking");
    };
};

 class Puppy extends Dog {
    void sound() {
        System.out.println("weeping");
    };
};

public class single {

    public static void main(String[] args) {

        Puppy p = new Puppy();

        p.eat();
        p.sound();
        

    }
}