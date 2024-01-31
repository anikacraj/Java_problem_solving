
class Gen1<T extends Comparable<T>>{
    T a,b,c;
    
    Gen1(T a, T b, T c){
        this.a=a; 
        this.b=b; 
        this.c=c; 
    }
    
    void print(){
        if(a.compareTo(b)> 0 && a.compareTo(c)>0){
        System.out.println(a);
        }
        else if(b.compareTo(c)>0){
        System.out.println(b);
        }
        else{
        System.out.println(c);
        }
        
    }
    
}
class maximumGen {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        
        Gen1<Integer> ob= new Gen1<>(40, 20, 5);
        Gen1<String> ob1= new Gen1<>("sxyz","Raj","Chow");
        ob.print();
        ob1.print();
    }
}