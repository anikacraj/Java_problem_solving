import java.util.Scanner;

public class Maxi {
  public static void main( String[]args)
  {
    int i,max,min;
    int a[] = new int[5];
    Scanner input = new Scanner(System.in);
    System.out.print("Enter array");
    for(i=0;i<5;i++)
    {
      a[i] = input.nextInt();
    }
    for(i=0;i<5;i++)
    {
      System.out.print(" " + a[i]);

    }
    max=a[0];
      for(i=1;i<5;i++)
      {
        if (a[0] < a[i])

        {
          max = a[i];
        }
      }
      min = a[0];
      for(i=1;i<5;i++)
      {
        if (a[0] > a[i])

        {
          min = a[i];
        }
      }
      System.out.print("\n The maximum number is="+max);
      System.out.print("\n The minimum number is="+min);
    
  }
}