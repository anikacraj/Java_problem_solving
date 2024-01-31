
import java.util.Scanner;
public class has{

     public static void main(String []args){
       // System.out.println("Hello, World!");
       
       Scanner sc = new Scanner (System.in);
       int n=0;
       double d=0.0;
       
       while(sc.hasNext()){
           if(sc.hasNextInt()){
           n = sc.nextInt();
        System.out.println(n);
           }
           
           if(sc.hasNextDouble()){
           d = sc.nextDouble();
        System.out.println(d);
           }
       }
       
     }
}
