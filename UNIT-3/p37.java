import java.util.Calendar;
class p37
{
    public static void main(String args[])
    {
        Calendar c = Calendar.getInstance();

        System.out.println("Current Date : " + c.getTime());

        c.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println("After adding 10 days : " + c.getTime());

        c.add(Calendar.DAY_OF_MONTH, -5);
        System.out.println("After subtracting 5 days : " + c.getTime());

        c.add(Calendar.MONTH, 2);
        System.out.println("After adding 2 months : " + c.getTime());

        c.add(Calendar.MONTH, -1);
        System.out.println("After subtracting 1 month : " + c.getTime());
    }
}