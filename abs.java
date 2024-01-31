abstract class User{
  void call(){
System.out.println("Non abstact method+calling method");
    }
    abstract void message();
}
 class Rahim extends User{
    //call method is here
 void message(){
        System.out.println("Abstact method for Rahim");
    }
 } 
class korim extends User{
void message(){
    System.out.println("Abstract method for karim");
}
}

 class abs {
    public static void main(String[] args) {
        User ob; //refernece variable

        ob=new Rahim();
       
        ob.message();
         ob.call();
         ob=new korim();
         ob.call();
        
    }
}
