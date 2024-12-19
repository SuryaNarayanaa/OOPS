interface Movable {
    void move();
}

interface Eatable {
    void eat();
}

class Dog implements Movable, Eatable {
    @Override
    public void move() {
        System.out.println("Dog moves");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats");
    }
}

public class Generics {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.move(); // Dog's implementation of move
        dog.eat();  // Dog's implementation of eat
    }
}
