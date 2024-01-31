public class Buffer {

    public static void main(String[] args) {
        StringBuffer ob=new StringBuffer("abc");
        System.out.println(ob.length());
        System.out.println(ob.charAt(0));
        ob.setCharAt(2, 'd');
        System.out.println(ob);
     System.out.println( ob.append("abx"));
     System.out.println(ob.deleteCharAt(0));
     System.out.println(ob.delete(0, 2));
     System.out.println(ob.reverse());
     System.out.println(ob.replace(0, 2, "ab"));
     System.out.println(ob.replace(3,4,  "dq"));
 ob.append("erd       ");

 System.out.println(ob);
 ob.reverse();
 System.out.println(ob);
 ob.append("         ");
ob.trimToSize();
System.out.println(ob);
    }
}
