public class overloading {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a*c;
    }
    public static void main(String[] args) {
        overloading ob=new overloading();
       System.out.println(ob.add(10, 05)); 
    }
}
