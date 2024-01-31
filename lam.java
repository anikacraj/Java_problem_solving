interface Func {
    int fact(int n);
}

class lam {
    public static void main(String[] args) {
      
    Func f = (n)->{
        int v = 1;
        for(int i=2; i<=n; i++)
           v = v * i;
        return v;   
    };
    
    System.out.print(f.fact(5));
          
          
      
    
  }
}