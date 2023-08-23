import java.util.Scanner;

public class sumofuppercase {
  

  public static void main(String[] args) {
    int row, col, i, j;
    int a[][] = new int[3][3];
    int b[][] = new int[3][3];
    int c[][] = new int[3][3];
  int sum = 0;
  int sum2 = 0;
  int sum3 = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter element for a matrix:");
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++) {
        System.out.printf("a[%d][%d]:", i, j);
        a[i][j] = input.nextInt();

      }
    }
   
    System.out.print("\n");

    System.out.println("Print A");
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++) {
        System.out.print(" " + a[i][j]);

      }
      System.out.print("\n");
    }
    
    System.out.println();
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++) {
        if (i < j) {
          sum = sum + a[i][j];
        }
         if (i > j) {
          sum2 = sum2 + a[i][j] ;
        }
      }
    }
    System.out.print("Sum of upper Elements: " + sum);
    System.out.print("\n \n Sum of lowwer Elements: " + sum2);
    int sum1 = 0;
     System.out.print("\n");
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++) {
        System.out.printf("b[%d][%d]:", i, j);
        b[i][j] = input.nextInt();

      }
    }
    System.out.print("\n");
    System.out.println("Print B");
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++) {
        System.out.print(" " + b[i][j]);

      }
      System.out.print("\n");
    }
    System.out.println();
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++) {
        if (i < j) {
          sum1 = sum1 + b[i][j];
        }
         if (i > j) {
          sum3= sum3 + b[i][j];
        }
      }
    }
    System.out.print("\n \n The upper elements sum of B matrix: " + sum1);
    System.out.print("\n \n The upper elements sum of B matrix: " + sum3);

    System.out.print("\n");
    System.out.print(" \n sum of lowwer and upper elements of A matrix:" + (sum + sum2));
    System.out.print(" \n \n sum of lowwer and upper elements of B matrix:" + (sum1 + sum3));
    int finalsum = sum + sum2 + sum1 + sum3;
    System.out.print("\n \n The sum of 2 matrix's upper and lowwer elements:"+finalsum);
    
  }
}


