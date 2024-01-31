class NewThread implements Runnable{
  Thread t;
  String name;
  NewThread(String name){
    this.name = name; 
    t = new Thread(this, name);
    System.out.println("Child Thread:"+t);
    t.start();
  }
  public void run(){
    try{
    for(int i=5;i>0;i--) {
      System.out.println(name + ":" +i);
        Thread.sleep(500);
  }
    } catch(InterruptedException e) {
        System.out.println("Child thread Interrupted:");
      }
  System.out.println("Exiting Child Thread:");
  }
}
public class thrd {
    public static void main(String[] args) {
      new NewThread("One");
      new NewThread("Two");
      
      try{
      for(int i=5;i>0;i--) {
        System.out.println("Main Thread:"+i);
        Thread.sleep(1000);
      }
      } catch(InterruptedException e) {
        System.out.println("Main thread Interrupted:");
      }
      System.out.println("Exiting Child Thread:");
  }
}