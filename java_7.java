import java.net.SocketPermission;
import java.util.Scanner;

public class java_7 {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter two number");
    int number = input.nextInt();
    int number1 = input.nextInt();
    int sum = number + number1;
    System.out.println(number+"+"+number1+"="+sum);


  }
}
