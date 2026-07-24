public class p1 {

    interface Animal {
        void sound();
        void eat();
    }

    static class Dog implements Animal {
        public void sound() {
            System.out.println("Dog barks");
        }

        public void eat() {
            System.out.println("Dog eats bones");
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.eat();
    }
}
