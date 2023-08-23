import java.util.Scanner;

public class Positive {
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("enter num:");
    int num = input.nextInt();
    if (num > 0)
    {
      System.out.print(" THis is Positive Number");
    }
    else
      System.out.print("This is negative number");
  }
}
