interface Moon {
    void showMoon();
}

interface Star {
    void showStar();
}
class Sky implements Moon, Star {

    public void showMoon() {
        System.out.println("This is Moon");
    }

    public void showStar() {
        System.out.println("This is Star");
    }

    public void display() {
        System.out.println("Sky inherits properties from both interfaces.");
    }
}

public class p8 {
    public static void main(String[] args) {
   Sky obj = new Sky();

        obj.showMoon();
        obj.showStar();
        obj.display();
    }
}