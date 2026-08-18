//overridding of abstract class
abstract class flower {
    abstract void sound();
}

class Rose extends flower {

    void sound() {
        System.out.println("Rose is red");
    }
}

public class p20 {
    public static void main(String[] args) {

        Rose r = new Rose();
        r.sound();
    }
}