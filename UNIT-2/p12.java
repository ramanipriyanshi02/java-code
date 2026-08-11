public class p12 {

    interface Animal {
        void eat();
    }

    interface Dog extends Animal {
        void bark();
    }

    static class Puppy implements Dog {
        public void eat() {
            System.out.println("Puppy eats food");
        }

        public void bark() {
            System.out.println("Puppy barks");
        }
    }

    public static void main(String[] args) {
        Puppy p = new Puppy();

        p.eat();
        p.bark();
    }
}
