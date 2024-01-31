class N<T extends Comparable<T>>{
    T a,b,c;
    N(T a,T b,T c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void print(){
        if(a.compareTo(b)>0 && a.compareTo(c)>0){
            System.out.println("The large is A");
        }
       else if(b.compareTo(c)>0){
 System.out.println("The large is B");
        }
        else{
             System.out.println("The large is C");
        }
    }
}

public class CompareString {
    public static void main(String[] args) {
        N <Integer> ob=new N<>(10, 20, 30);
        N <String> ob1=new N<>("Anik", "Raj","xsa");
        ob.print();
        ob1.print();
    }
}
