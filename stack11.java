interface stk123{
    void push(int v);
    int pop();
}
class Stk12 implements stk123{
    private int ar[];
    private int top;
    Stk12(int size){
        ar=new int[size];
        top=-1;
    }
   public void push(int v){
        top++;
        ar[top]=v;
    }
   public int pop(){
       
        return ar[top--];
    }
    void Display(){
        for(int i=0;i<=top;i++){
            System.out.println(ar[i]);
        }
    }
}

public class stack11 {
    public static void main(String[] args) {
        Stk12 sk=new Stk12(5);
    sk.push(10);
    sk.push(20);
    sk.push(230);
    sk. Display();
    sk.pop();
    sk.Display();
    }
    
}
