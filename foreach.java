import javax.sound.midi.Soundbank;

public class foreach {
  public static void main(String []args)
  {
    int sum = 0;
      String[] a = { "anik", "Raj", "Chow", "Dhury" };
    for (String x : a)
   {
     System.out.println(x);
     }
      int[] num={2,4,6,8};
      for(int x:num)
      {
        System.out.print(x+" ");
        sum=sum+x;
      }
      System.out.print("\n The sum is="+sum);
  }
  
}
