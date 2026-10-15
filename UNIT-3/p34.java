class p34
{
    interface Test
    {
        void display();
    }

    public static void main(String args[])
    {
        Test obj = new Test()
        {
            public void display()
            {
                System.out.println("This is a nested interface.");
            }
        };

        obj.display();
    }
}