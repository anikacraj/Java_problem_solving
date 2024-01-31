 class cnstruct {
    String name,gender;
    int age;
    cnstruct(){
        System.out.println("no value");
    }
    cnstruct(String n,String g,int a){
name=n;
gender=g;
age=a;

    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Name:"+gender);
        System.out.println("Name:"+age);
    }
}
public class cnstructr{
    public static void main(String[] args) {
        cnstruct ob=new cnstruct();
        ob.display();
         cnstruct ob1=new cnstruct("Anik","Male",21);
        ob1.display();
    }
}
