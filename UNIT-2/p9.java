// program to use method overriding
class Flower {

    public void sound() {
        System.out.println("Flower smells good");
    }
}

class Sunflower extends Flower {
    public void sound() {
        System.out.println("Sunflower is yellow");
    }
}

public class p9 {
    public static void main(String[] args) {

        Sunflower f = new Sunflower();
        f.sound();
    }
}