class myThread11 implements Runnable{
    Thread t ;
    myThread11(){
        t = new Thread(this,"Demo");
        t.start();
    }

    public void run(){
        try {
            for(int i=0; i<=10; i++){
                System.out.print(i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
public class Thread11 {
    public static void main(String[] args) {
        
        new myThread11();
        try {
            for(int i=0; i<"Hello".length(); i++){
                System.out.print("Hello".charAt(i));
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
