import java.util.Scanner;

public class Reverse {
  public static void main(String[] args) 
  {
    int temp = 0,sum=0;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter digit:");
    int num = input.nextInt();
    temp = num;
    while (temp != 0) {
      int r = temp % 10;
      sum = sum * 10 + r;
      temp = temp / 10;
    }
  }
  System.out.print("The reverse digit:"+temp);
  
}
