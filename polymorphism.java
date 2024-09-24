class Hewan {
    public void suara() {
        System.out.println("Hewan mengeluarkan suara");
    }
}

class Kucing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Kucing nginnging");
    }
}

class Anjing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Anjing gaga");
    }
}

public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Kucing();  
        Hewan hewan2 = new Anjing();  

        hewan1.suara();  
        hewan2.suara();  
    }
}
