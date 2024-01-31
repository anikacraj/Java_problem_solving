import java.util.LinkedList;
class adrs{
    String name;
    String age;
    adrs(String name,String age){
        this.name=name;
        this. age=age;
        
    }
}


public class UserBasedList {
    public static void main(String[] args) {
      LinkedList<adrs>list=new LinkedList<>();
      list.add(new adrs("Anik", "20"));
      list.add(new adrs("Aik", "22"));
      for(adrs a:list){
        System.out.println(a);
      }
    }
    
}
