import java.util.Scanner;

public class User_input
{
  public static void main(String []args)
  {
    //System.out.println("Anik");
    Scanner input = new Scanner(System.in);
   // Scanner input = new Scanner(System.in);
       System.out.print("enter 1st number:");
    System.out.print("enter 2nd number");
    int number = input.nextInt();
    int number2 = input.nextInt();
    int sum = number + number2;
    int sub = number - number2;
    
    System.out.println("the 1st number is :"+number);
    System.out.println("the 2nd number is :" + number2);
    System.out.println("The Sum is :"+sum);
    System.out.println("the sub is :" + sub);
    if(number >number2)
    {
      System.out.println("The large Numbere is :" + number);
    }
    else
    {
       System.out.println( number2+"The large Numbere is :" + number2);
    }

  }
}