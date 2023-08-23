import java.util.Scanner;

public class SumOfdigit {
  public static void main(String[] args) {
    int i, sum = 0;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter num");
    int n = input.nextInt();
    int temp = n;
    while (temp != 0) {

      sum = sum*10+ temp % 10;
      temp = temp / 10;

    }
    System.out.print("Sum of digit :"+sum);

  }
}
