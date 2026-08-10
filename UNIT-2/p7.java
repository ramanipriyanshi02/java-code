interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class p7 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}                          