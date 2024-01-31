
class myThread10 implements Runnable{
    public void run(){
        System.out.println("Child Thread "+myThread10.class.getName());
    }
}

public class T10 {
    public static void main(String[] args) {
        myThread10 bullet1 = new myThread10();


        Thread gun1 = new Thread(bullet1);


        gun1.start();

    }
}
