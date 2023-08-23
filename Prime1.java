import java.util.Scanner;

public class Prime1 {
  public static void main(String[]args)
  {
    int i,count=0;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter num");
    int n = input.nextInt();
    if(n==0||n==1)
    {
      System.out.print("NOt prime \n");

    }
    else
    {
      for (i = 2; i < n/2; i++) {
        if (n % i == 0) {
          count++;
          break;
        }

      }
      if (count == 0)
        System.out.print("prime NUm\n");
        else
        System.out.println("not prime");
    }
    
    
   
  }
  
}
