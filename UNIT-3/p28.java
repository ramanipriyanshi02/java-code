class MyException extends Exception
{
    MyException(String message)
    {
        super(message);
    }
}

class p28
{
    public static void main(String args[])
    {
        int age = 15;

        try
        {
            if(age < 18)
            {
                throw new MyException("Age must be 18 or above");
            }

            System.out.println("You are eligible.");
        }
        catch(MyException e)
        {
            System.out.println(e.getMessage());
        }
    }
}