abstract class animal
{
    abstract void sound();

    void eat()
    {
        System.out.println("animal is eating");
    }
}

class dog extends animal
{
    void sound()
    {
        System.out.println("dog barks");
    }
}

public class p6
{
    public static void main(String[] args)
    {
        dog d = new dog();

        d.sound();
        d.eat();
    }
}