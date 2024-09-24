package inheritance;

class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("Meow");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.eat();  
        myCat.meow(); 
    }
}
