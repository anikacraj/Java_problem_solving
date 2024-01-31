interface A{
    boolean test(int n);
  
}
class NumTest12 {
    public static void main(String[] args) {
        
        A sb1= (n)-> n%2==0;
        
  
        if(sb1.test(105))
            System.out.println("Even");
        else
            System.out.println("Odd");
        
    }
}