import java.util.Scanner;
public class program2
{
   public static void main(String[]args)
 {
   Scanner b= new Scanner(System.in);
   System.out.println("Enter two number:");
   int num1=b.nextInt();
   String num2=b.nextLine();

   System.out.println("Ans"+num1);
   System.out.println("Ans"+num2);
 b.close();
}
}