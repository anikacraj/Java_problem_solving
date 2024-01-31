import java.util.LinkedList;

class St5{
    String name,Cls;
    int id;
    St5(String n,String c,int i){
      name=n;
      Cls=c;
      id=i;
    }
}
public class linekList {
    public static void main(String[] args) {
       LinkedList<St5> list=new LinkedList<St5>();
       St5 ob1=new St5("Anik", "eleven", 101);
       St5 ob2=new St5("An", "eleven", 103);
       St5 ob3=new St5("ik", "eleven", 102);
       list.add(ob1);
       list.add(ob2);
       list.add(ob3);
    
       for(St5 s:list){
System.out.println(+s.id+" "+s.name+" "+s.Cls);
       }
    
       
    }
}
