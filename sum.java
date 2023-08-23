import java.util.Scanner;
public class sum {
  public static void main(String[] args) {
    int row,col,i,j;
    int a[][] = new int[2][3];
    int b[][] = new int[2][3];
    int c[][] = new int[2][3];
   
    Scanner input=new Scanner(System.in);
    System.out.println("Enter element for a matrix:");
    for(i=0;i<2;i++)
    {
      for (j = 0; j < 3; j++) {
        System.out.printf("a[%d][%d]:", i, j);
        a[i][j] = input.nextInt();

      }
    }
       System.out.print("\n");
    for(i=0;i<2;i++)
    {
      for (j = 0; j < 3; j++) {
        System.out.printf("b[%d][%d]:", i, j);
        b[i][j] = input.nextInt();

      }
    }
       System.out.print("\n");
    System.out.println("Print B");
     for(i=0;i<2;i++)
    {
      for (j = 0; j < 3; j++) {
        System.out.print(" " + b[i][j]);

      }
      System.out.print("\n");
    }
    System.out.print("\n");
   

    System.out.println("Print A");
     for(i=0;i<2;i++)
     {
       for (j = 0; j < 3; j++) {
         System.out.print(" " + a[i][j]);

       }
       System.out.print("\n");
     }
      for(i=0;i<2;i++)
      {
        for (j = 0; j < 3; j++) {
          c[i][j] = a[i][j] + b[i][j];
        }
      }
      System.out.println();
       for(i=0;i<2;i++)
       {
         for (j = 0; j < 3; j++) {
           System.out.print(" " + c[i][j]);
         }
         System.out.print("\n");
       }

  }
}
