import java.util.Scanner;
public class program3
{
 public static void main(String[]args)
{
  Scanner a= new Scanner(System.in);
  System.out.println("Enter a name:");
  String name=a.nextLine();

  System.out.println("enter address:");
  String address=a.nextLine();

  System.out.println("enter state:");
  String state=a.nextLine();

  System.out.println("enter age:");
  int age=a.nextInt();

  System.out.println("name:"+name);
  System.out.println("address:"+address);
  System.out.println("state:"+state);
  System.out.println("age:"+age);

 a.close();
  
  
  
  
}
}