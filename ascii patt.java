public class ascii patt {
   public static void main(String[]args)
  {
    int i, row, col, n;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter num:");
    n = input.nextInt();
    for(row=1;row<=n;row++)
    {
      for (col = 1; col <= row; col++)
        
      {
        System.out.printf(" %d", (col + 65) );
      }
      System.out.print("\n");
        
    }
  }
}
