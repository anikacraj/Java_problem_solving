import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;


public class Collections1 {
    public static void main(String[] args) {
     ArrayList<Integer>list1 =  new ArrayList<>();
     list1.add(10);  
     list1.add(20);  
     list1.add(30);  
     list1.add(40); 
     System.out.println(list1); 
     list1.add(1,100);
     System.out.println(list1); 

     System.out.println(list1.remove(2));
     System.out.println(list1.remove(1));

     list1.set(0, 200);
     System.out.println(list1);

     List list2 = new ArrayList<>();
    list2.add("shakib");
    list2.add(100);
    list2.add(100.100);
    System.out.println(list2);

    LinkedList<Integer> list3 = new LinkedList<>();
    list3.add(2);
    list3.add(1,3);
    list3.set(1,4);
    list3.addLast(1);
    System.out.println(list3);
    System.out.println(list3.get(0));
    System.out.println(list3.remove());
     System.out.println(list3);

    Stack <Integer> stack = new Stack<>();
    stack.push(10);
    stack.push(11);
    stack.push(12);
     System.out.println(stack);
    System.out.println(stack.pop());
    System.out.println(stack.peek());
    System.out.println(stack);

    Queue<Integer> q = new LinkedList<>();
    q.add(10);
    q.add(11);
    q.add(12);
    System.out.println(q.poll());
    System.out.println(q.peek());

    PriorityQueue<Integer>Pr = new PriorityQueue<>();
    Pr.add(103);
    Pr.add(90);
    Pr.add(23);
    Pr.add(102);
    Pr.add(100);

    System.out.println(Pr.peek());
    System.out.println(Pr.poll());
    System.out.println(Pr);
    }
}
