import java.util.Scanner;

public class ArraySum {
  public static void main(String[] args) {
    int i;
    Scanner input = new Scanner(System.in);
    double[] array = new double[5];
    double sum = 0;
    double avg = 0;
    System.out.print("Enter 5 num:");
    for (i = 0; i < array.length; i++) {
      array[i] = input.nextDouble();
    }
    for (i = 0; i < array.length; i++) {
      sum = sum + array[i];
      avg = sum / array.length;
    }
    System.out.print("sum is =" + sum);
    System.out.print("\n avg is =" + avg);
    
    
  }
}
