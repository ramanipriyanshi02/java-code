class p33
{
    void display()
    {
        class Local
        {
            void show()
            {
                System.out.println("This is a local inner class.");
            }
        }

        Local obj = new Local();
        obj.show();
    }

    public static void main(String args[])
    {
        p33 p = new p33();
        p.display();
    }
}