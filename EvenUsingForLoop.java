import java.util.Scanner;

public class EvenUsingForLoop {
  public static void main(String[] args)
  {
    int i,sum=0;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter 1st num");
    int n1 = input.nextInt();
    System.out.print("Enter 2nd number");
    int n2 = input.nextInt();
    for( i=n1;i<=n2;i++)
    {
      if (i % 2 == 0) {
        System.out.print(i);
        sum = sum + i;
      }

    }
    System.out.print("\nThe sum of Even num:\n" + sum);
    sum = 0;
     for( i=n1;i<=n2;i++)
    {
      if (i % 2 != 0) {
        System.out.println(i);
        sum = sum + i;
      }

    }
    System.out.print("\n The sum of Odd num:" + sum);

  }

  
}
