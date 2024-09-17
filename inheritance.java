class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.eat();  // Output: This animal eats food.
        myCat.meow(); // Output: Meow
    }
}
