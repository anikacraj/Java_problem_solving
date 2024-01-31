abstract class shape{
    double d1,d2;
    shape(double d1,double d2){
        this.d1=d1;
        this.d2=d2;

    }
    abstract void message();
}
class Rec extends shape{
    double d3;
    Rec(double d1,double d2,double d3){
super(d1,d2);
this.d3=d3;
    }
    void message(){
        double result =d1*d3;
        System.out.println("REC:"+result);
    }
}
class Tri extends shape{
   
    Tri(double d1,double d2){
super(d1,d2);

    }
    void message(){
        double result=d1*d2*0.5;
        System.out.println("tri:"+result);
    }
}
class Circle extends shape{
    //d1,d2
    Circle(double r){
        super(r, r);

    }
    void message(){
        double result=Math.PI* d1* d2;
        System.out.println("Circle:"+result);
    }
}

public class abs2 {
    public static void main(String[] args) {
        shape ob;
        ob=new Rec(2, 04, 05);
        ob.message();
        ob=new Tri(3, 4);
        ob.message();
        ob=new Circle(3);
        ob.message();

    }
}
