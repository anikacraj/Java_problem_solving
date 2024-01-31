public class Testimmutablestring1 {
    public static void main(String[] args) {
        String s="Sachin";  
        s=s.concat(" Tendulkar");  
        System.out.println(s);  


        String s1="Sachin";  
        String s2="Sachin";  
        String s3=new String("Sachin");  
        String s4="Saurav";  
        System.out.println(s1.equals(s2));//true  
        System.out.println(s1.equals(s3));//true  
        System.out.println(s1.equals(s4));//false  

        // String s1="Sachin";  
        // String s2="SACHIN";  
       
        // System.out.println(s1.equals(s2));//false  
        // System.out.println(s1.equalsIgnoreCase(s2));//true  

       
            //   String s1="Sachin";  
            //   String s2="Sachin";  
            //   String s3=new String("Sachin");  
            //   System.out.println(s1==s2);//true (because both refer to same instance)  
            //   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  

            // String s1="Sachin";  
            // String s2="Sachin";  
            // String s3="Ratan";  
            // System.out.println(s1.compareTo(s2));//0  
            // System.out.println(s1.compareTo(s3));//1(because s1>s3)  
            // System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  

            // StringBuilder s1 = new StringBuilder("Hello");    //String 1  
            // StringBuilder s2 = new StringBuilder(" World");    //String 2  
            // StringBuilder s = s1.append(s2);   //String 3 to store the result  
            //     System.out.println(s.toString());  //Displays result  
    }
}
