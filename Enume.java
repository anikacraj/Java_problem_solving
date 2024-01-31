 enum day{ Sun,mon,tue,wed,th,fri};

public class Enume {
  
   public static void main(String[] args) {
   day d=day.th;
   System.out.println(d);
   day d1=day.tue;
   System.out.println(d1.ordinal());
   day []d2=day.values();
   
   } 
}
