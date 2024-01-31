interface A{
    void message();
}
interface B{
    void message();
}
class C  implements A,B{
     public void message(){
        System.out.println("C class ");
    }
}


public class mulIn {
    public static void main(String[] args) {
        C ob=new C();
        ob.message();
    }
}
