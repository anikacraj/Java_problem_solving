import java.util.Scanner; 
public class excep2 {
    public static void main(String[] args) {
      
     while (true) {
        {
         try{
             Scanner input=new Scanner(System.in);
         System.out.print("Please enter 1st number:");
     
       int n=input.nextInt();
 System.out.print("Please enter 2nd number:");
 int m=input.nextInt();
 int REsult=n/m;
 System.out.println("the result:"+REsult);

      } catch(Exception e){
      System.out.println("Exception:" +e);
      System.out.println("Please enter integer number");

      }
     
     }
     }
    }
}
