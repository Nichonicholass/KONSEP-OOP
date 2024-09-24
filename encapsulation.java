package encapsulation;
class Person {
    private String name; // Data tersembunyi
    private int age;

    // Setter untuk nama
    public void setName(String name) {
        this.name = name;
    }

    // Getter untuk nama
    public String getName() {
        return name;
    }

    // Setter untuk usia
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    // Getter untuk usia
    public int getAge() {
        return age;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Adit");
        person.setAge(30);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());   
    }
}
