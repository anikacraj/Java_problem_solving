interface Stack_interface {
    public void push(int value);
    public int pop();
   
}

class Stack_class implements Stack_interface{
    private int top;
    private int arr[];
    
    Stack_class(int size){
        arr= new int[size];
        top= -1;
    }
    public void push(int value){
        top++;
        arr[top]=value;
    }
    public int pop(){
       top--;
       return arr[top+1];
    }
    
    void Display(){
        for(int i=0;i<=top;i++)
            System.out.println(arr[i]);
    }
}
  
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        Stack_class stk = new Stack_class(10);
        
        stk.push(10);
        stk.push(10);
        stk.push(10);
        stk.Display();
        System.out.println("popped"+stk.pop());
        stk.Display();
        
    }
}
