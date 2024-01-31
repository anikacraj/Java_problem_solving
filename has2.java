import java.util.Scanner;
public class has2 {
    public static void main(String[] args) {
        int i;
        String s;
        double d;
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter number:");
        while(ob.hasNext()){
if(ob.hasNextInt()){
    i=ob.nextInt();
    System.out.println(i);
}
else if(ob.hasNextDouble()){
    d=ob.nextDouble();
    System.out.println(d);
}
else {
    s = ob.next();
    if(s.equals("end")) return;
    System.out.print(s+ " ");
}
        }
    }
}
