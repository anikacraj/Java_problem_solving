public class excep {
    public static void main(String[] args) {
        try{
             int x=10;
             int y=x/1;
             System.out.println("REsult:"+y);
            int [] a=new int[3];
           a[5]=10;
        }
        catch(ArithmeticException e1){
             System.out.println("Exception:"+e1);
         }
        catch(ArrayIndexOutOfBoundsException e2){
        System.out.println("Exception2:"+e2);
        }
catch(Exception e3){
      System.out.println("Exception3:"+e3);
}

        finally{
            System.out.println("abc");
        }
System.out.println("last line");
// int x=10;
// int y=0;
// int r=x/y;
// System.out.println(r);
// System.out.println("this is my program");

    }
}
