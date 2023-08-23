import java.util.Scanner;

public class Namota {
  public static void main(String[] args) {
    int i, count = 0;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter num");
    int n = input.nextInt();
    System.out.print("Enter 1st num:");
    int a= input.nextInt();
    System.out.print("Enter 2nd num");
    int b = input.nextInt();
    for (i = a; i<=b; i++) {

      System.out.println(n + "x" + i + "=" + n * i);
    }

  }
}
