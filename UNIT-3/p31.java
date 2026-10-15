class p31
{
    int x = 10;

    class Inner
    {
        void display()
        {
            System.out.println("Value of x = " + x);
        }
    }

    public static void main(String args[])
    {
        p31 obj = new p31();
        p31.Inner in = obj.new Inner();

        in.display();
    }
}