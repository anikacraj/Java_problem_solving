import java.util.Scanner;

public class prime {
  public static void main(String[]args)
  {
    int count = 0, i, j;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter 1st num");
    int m = input.nextInt();
    System.out.print("Enter 2nd number");
    int n = input.nextInt();
    if (m == 0 || m == 1)
    {
      System.out.println("not a valid number");
    }
    else
    {
      for (i = m; i <= n; i++) {
        for (j = 2; j <= i - 1; j++) {
          if (i % j == 0) {
            count++;
            break;

          }
        }
        if (count == 0)
          System.out.print(i+" ");
        count = 0;
      }
    }
    
  }
  
}
