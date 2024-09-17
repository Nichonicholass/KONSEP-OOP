package abstrak;
abstract class Password {
    abstract void isiPassword(); // Metode abstrak
}

class Pass extends Password {
    @Override
    void isiPassword() {
        System.out.println("password1234");
    }
}

public class Main {
    public static void main(String[] args) {
        Password myPass = new Pass();
        myPass.isiPassword(); 
    }
}
