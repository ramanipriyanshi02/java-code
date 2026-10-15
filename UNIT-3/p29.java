class p29
{
    void method1()
    {
        int a = 10 / 0;
    }

    void method2()
    {
        method1();
    }

    void method3()
    {
        try
        {
            method2();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception handled in method3");
        }
    }

    public static void main(String args[])
    {
        p29 obj = new p29();
        obj.method3();
    }
}