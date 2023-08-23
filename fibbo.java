import java.util.Scanner;

public class fibbo {
  public static void main(String[] args) {
    int i = 0, a = 0, b = 1, sum = 0;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter num");
    int n = input.nextInt();
    
    while (i < n) {
      if (i < 2)
        System.out.print(i + " ");
      sum = a + b;
      a = b;
      b = sum;
      System.out.print(sum + " ");
      i++;
    }
  }
    

  
}
