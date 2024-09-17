class MathOperations {
    // Overloaded methods
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println(math.add(5, 10));       // Output: 15
        System.out.println(math.add(5.5, 10.5));   // Output: 16.0
        System.out.println(math.add(1, 2, 3));     // Output: 6
    }
}
