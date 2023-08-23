import java.util.Scanner;

public class fac {
  public static void main(String[] args) {
    int i = 0, fac = 1;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter num");
    int n = input.nextInt();
    for (i = n; i >= 1; i--) {
      fac = fac * i;
    }
    System.out.print(fac);
  }
}
