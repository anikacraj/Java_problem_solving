abstract class Shape{
    int a,b,c;
    Shape(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
 abstract   void msg();
}
class rec extends Shape{
    int x;
    rec(int x,int b){
        super(x, b, b);
        this.x=x;
    }
    void msg(){
        System.out.println("rec:"+x*b);
    }
}
    class Tri extends Shape{
        int y,z;
        Tri(int x,int y,int z){
            super(x, y, z);
           
            this.y = y;
            this.z = z;

        }
    void msg(){
        System.out.println("Tri:"+0.5*y*z);
    }
    }


public class abs3 {
    public static void main(String[] args) {
        Shape ob;
        ob=new rec(10, 5);
        ob.msg();
        ob=new Tri(3, 1, 0);
        ob.msg();
     
    }
}
