class p32
{
    static int x = 20;

    static class Inner
    {
        void display()
        {
            System.out.println("Value of x = " + x);
        }
    }

    public static void main(String args[])
    {
        p32.Inner obj = new p32.Inner();

        obj.display();
    }
}