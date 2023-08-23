import java.util.Scanner;

public class diagonalsum {
  public static void main(String[] args) {
    int row, col, i, j;
    int a[][] = new int[3][3];
    int b[][] = new int[3][3];
    int c[][] = new int[3][3];
  int sum = 0;

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
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++) {
        c[i][j] = a[i][j] + b[i][j];
      }
    }
    System.out.println();
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++) {
        if (i == j) {
          sum = sum + a[i][j] ;
        }
      }
    }
    System.out.print("Sum of Diagonal: " + sum);
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
        if (i == j) {
          sum1= sum1 + b[i][j];
        }
      }
    }
    System.out.print("The diagonal sum of B matrix: " + sum1);
    System.out.print("\n");
    System.out.print("Diagonal sum of A and B matrix:"+(sum+sum1));
  }
}
