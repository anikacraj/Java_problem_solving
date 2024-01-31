interface Animal{
    void message();
}
class Dog implements Animal{
    public void message(){
        System.out.println("Dog");
    }
}

class Cat implements Animal{
    public void message(){

    System.out.println("Cat");
    }
}


public class interF {
    public static void main(String[] args) {
        Dog ob=new Dog();
        ob.message();
        Cat ob2=new Cat();
        ob2.message();
    }
}
